import java.sql.*;
import java.util.Scanner;

public class ExercicioDB {

    private static final String URL = System.getenv().getOrDefault(
            "DB_URL",
            "jdbc:postgresql://localhost:5432/biblioteca"
    );

    private static final String USUARIO = System.getenv().getOrDefault(
            "DB_USER",
            "postgres"
    );

    private static final String SENHA = System.getenv().getOrDefault(
            "DB_PASSWORD",
            ""
    );

    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
                Scanner sc = new Scanner(System.in)
        ) {
            criarTabela(conn);

            int opcao;

            do {
                System.out.println("\n=== Biblioteca ===");
                System.out.println("1. Listar livros");
                System.out.println("2. Cadastrar livro");
                System.out.println("3. Emprestar livro");
                System.out.println("4. Devolver livro");
                System.out.println("5. Remover livro");
                System.out.println("0. Sair");
                System.out.print("Opcao: ");

                while (!sc.hasNextInt()) {
                    System.out.println("Digite apenas numeros.");
                    System.out.print("Opcao: ");
                    sc.nextLine();
                }

                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        listarLivros(conn);
                        break;

                    case 2:
                        cadastrarLivro(conn, sc);
                        break;

                    case 3:
                        emprestarLivro(conn, sc);
                        break;

                    case 4:
                        devolverLivro(conn, sc);
                        break;

                    case 5:
                        removerLivro(conn, sc);
                        break;

                    case 0:
                        System.out.println("Sistema encerrado.");
                        break;

                    default:
                        System.out.println("Opcao invalida. Tente novamente.");
                }

            } while (opcao != 0);

        } catch (SQLException e) {
            System.out.println("Erro ao conectar ou executar operacao no banco de dados.");
            System.out.println("Confira se o PostgreSQL esta aberto, se o banco 'biblioteca' existe e se usuario/senha estao corretos.");
            e.printStackTrace();
        }
    }

    public static void criarTabela(Connection conn) throws SQLException {
        String sql = """
                CREATE TABLE IF NOT EXISTS livros (
                    id SERIAL PRIMARY KEY,
                    titulo TEXT NOT NULL,
                    autor TEXT NOT NULL,
                    ano INTEGER NOT NULL,
                    disponivel INTEGER NOT NULL
                )
                """;

        try (Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        }
    }

    public static void listarLivros(Connection conn) {
        String sql = "SELECT id, titulo, autor, ano, disponivel FROM livros ORDER BY titulo";

        try (
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()
        ) {
            boolean encontrou = false;

            while (rs.next()) {
                encontrou = true;

                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                String autor = rs.getString("autor");
                int ano = rs.getInt("ano");
                int disponivel = rs.getInt("disponivel");

                String situacao = disponivel == 1 ? "DISPONIVEL" : "EMPRESTADO";

                System.out.println("[" + id + "] " + titulo + " - " + autor + " (" + ano + ") - " + situacao);
            }

            if (!encontrou) {
                System.out.println("Nenhum livro cadastrado.");
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar livros.");
            e.printStackTrace();
        }
    }

    public static void cadastrarLivro(Connection conn, Scanner sc) {
        try {
            System.out.print("Digite o titulo do livro: ");
            String titulo = sc.nextLine();

            System.out.print("Digite o autor do livro: ");
            String autor = sc.nextLine();

            System.out.print("Digite o ano de publicacao: ");
            while (!sc.hasNextInt()) {
                System.out.println("Digite um ano valido.");
                System.out.print("Digite o ano de publicacao: ");
                sc.nextLine();
            }

            int ano = sc.nextInt();
            sc.nextLine();

            String sql = "INSERT INTO livros (titulo, autor, ano, disponivel) VALUES (?, ?, ?, 1)";

            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, titulo);
                stmt.setString(2, autor);
                stmt.setInt(3, ano);
                stmt.executeUpdate();
            }

            System.out.println("Livro cadastrado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar livro.");
            e.printStackTrace();
        }
    }

    public static void emprestarLivro(Connection conn, Scanner sc) {
        atualizarDisponibilidade(conn, sc, 0, "emprestar", "Livro emprestado com sucesso!");
    }

    public static void devolverLivro(Connection conn, Scanner sc) {
        atualizarDisponibilidade(conn, sc, 1, "devolver", "Livro devolvido com sucesso!");
    }

    private static void atualizarDisponibilidade(
            Connection conn,
            Scanner sc,
            int disponibilidade,
            String acao,
            String mensagemSucesso
    ) {
        try {
            System.out.print("Digite o id do livro que deseja " + acao + ": ");

            while (!sc.hasNextInt()) {
                System.out.println("Digite um id valido.");
                System.out.print("Digite o id do livro que deseja " + acao + ": ");
                sc.nextLine();
            }

            int id = sc.nextInt();
            sc.nextLine();

            String sql = "UPDATE livros SET disponivel = ? WHERE id = ?";

            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, disponibilidade);
                stmt.setInt(2, id);

                int linhasAfetadas = stmt.executeUpdate();

                if (linhasAfetadas > 0) {
                    System.out.println(mensagemSucesso);
                } else {
                    System.out.println("Livro nao encontrado.");
                }
            }

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar livro.");
            e.printStackTrace();
        }
    }

    public static void removerLivro(Connection conn, Scanner sc) {
        try {
            System.out.print("Digite o id do livro que deseja remover: ");

            while (!sc.hasNextInt()) {
                System.out.println("Digite um id valido.");
                System.out.print("Digite o id do livro que deseja remover: ");
                sc.nextLine();
            }

            int id = sc.nextInt();
            sc.nextLine();

            String sql = "DELETE FROM livros WHERE id = ?";

            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, id);

                int linhasAfetadas = stmt.executeUpdate();

                if (linhasAfetadas > 0) {
                    System.out.println("Livro removido com sucesso!");
                } else {
                    System.out.println("Livro nao encontrado.");
                }
            }

        } catch (SQLException e) {
            System.out.println("Erro ao remover livro.");
            e.printStackTrace();
        }
    }
}
