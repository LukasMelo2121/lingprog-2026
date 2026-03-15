import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos termos da sequência você quer ver?");
        int n = entrada.nextInt();

        int a = 0;
        int b = 1;

        System.out.print(a + " " + b + " ");

        for (int i = 3; i <= n; i++) {
            int proximo = a + b;
            System.out.print(proximo + " ");

            a = b;
            b = proximo;
        }
    }
}
