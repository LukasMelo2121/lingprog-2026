import java.util.Scanner;

public class FatorialNumero {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = entrada.nextInt();

        int fatorial = 1;

        for (int i = numero; i >= 1; i--) {
            fatorial = fatorial * i;
        }

        System.out.println("Fatorial de " + numero + " = " + fatorial);
    }
}
