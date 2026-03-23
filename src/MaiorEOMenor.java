//Esse foi foda, nao consegui fazer funcionar e pedi pra IA T-T

import java.util.Scanner;

public class MaiorEOMenor {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n[] = new int[10];

        for (int i = 0; i < n.length; i++) {
            System.out.println("Digite um número:");
            n[i] = entrada.nextInt();
        }
        
        int maior = n[0];
        int menor = n[0];
        int posMaior = 0;
        int posMenor = 0;

        for (int i = 0; i < n.length; i++) {

            if (n[i] > maior) {
                maior = n[i];
                posMaior = i;
            }

            if (n[i] < menor) {
                menor = n[i];
                posMenor = i;
            }
        }

        System.out.println("Maior: " + maior + " posição: " + posMaior);
        System.out.println("Menor: " + menor + " posição: " + posMenor);
    }
}
