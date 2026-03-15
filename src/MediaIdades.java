import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int idade;
        int soma = 0;
        int contador = 0;

        System.out.println("Digite uma idade (negativo para parar):");
        idade = entrada.nextInt();

        while (idade >= 0) {
            soma += idade;
            contador++;

            System.out.println("Digite outra idade (negativo para parar):");
            idade = entrada.nextInt();
        }

        double media = (double) soma / contador;

        System.out.println("Média das idades: " + media);
    }
}
