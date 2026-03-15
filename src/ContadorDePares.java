import java.util.Scanner;

public class ContadorDePares {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o limite inferior:");
        int inicio = entrada.nextInt();

        System.out.println("Digite o limite superior:");
        int fim = entrada.nextInt();

        for (int i = inicio; i <= fim; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
