import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String usuario;
        String senha;

        System.out.println("Digite o Usuário: ");
        usuario = entrada.next();
        System.out.println("Digite o Senha: ");
        senha = entrada.next();

        while(usuario.equals(senha)) {

            System.out.println("Usuário e Senha não podem ser iguais");
            System.out.println("Digite o Usuário: ");
            usuario = entrada.next();
            System.out.println("Digite o Senha: ");
            senha = entrada.next();


        }
    }
}
