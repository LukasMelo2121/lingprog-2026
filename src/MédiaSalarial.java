import java.util.Scanner;

public class MédiaSalarial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] salario = new double[5];

        double soma = 0;
        double media;

        int acima = 0;
        int abaixo = 0;
        int igual = 0;

        for (int i = 0; i < salario.length; i++) {
            System.out.println("Digite o salário:");
            salario[i] = entrada.nextDouble();
            soma += salario[i];
        }

        media = soma / salario.length;

        for (int i = 0; i < salario.length; i++) {

            if (salario[i] > media) {
                acima++;
            } else if (salario[i] < media) {
                abaixo++;
            } else {
                igual++;
            }
        }
        System.out.println("Média salarial: " + media);
        System.out.println("Acima da média: " + acima);
        System.out.println("Abaixo da média: " + abaixo);
        System.out.println("Igual à média: " + igual);
    }
}