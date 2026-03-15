import java.util.Scanner;

public class CadastroProdutos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String produtoMaisCaro = "";
        double maiorPreco = 0;

        while (true) {

            System.out.println("Digite o nome do produto:");
            String nome = entrada.next();

            System.out.println("Digite o preço:");
            double preco = entrada.nextDouble();

            if (preco > maiorPreco) {
                maiorPreco = preco;
                produtoMaisCaro = nome;
            }

            System.out.println("Deseja continuar? (S/N)");
            String resposta = entrada.next();

            if (resposta.equalsIgnoreCase("N")) {
                break;
            }
        }

        System.out.println("Produto mais caro: " + produtoMaisCaro);
        System.out.println("Preço: " + maiorPreco);
    }
}