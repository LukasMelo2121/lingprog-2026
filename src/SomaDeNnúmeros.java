import java.util.Scanner;

public class SomaDeNnúmeros {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Deseja somar quantos números? ");
        int n = entrada.nextInt();

        double soma = 0;

        for (int i = 1; i < n+1; i++) {
            System.out.println("Qual número a ser acrescentado a soma? ");
            double numero = entrada.nextInt();
            soma = n + soma;
        }
        System.out.println("O resultado da soma é " +soma);

    }
}
