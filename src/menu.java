import java.util.Scanner;

public class menu {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcao = 0;

        do {
            System.out.println("Escolha a opção");
            System.out.println("1, 2, 3");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu 1");
                    break;

                case 2:
                    System.out.println("Você escolheu 2");
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 3);
    }
}