import java.util.Scanner;

public class UniãoDeVetores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int v1[] = new int[5];
        int v2[] = new int[5];

        int v3[] = new int[10];

        for (int i = 0; i <v1.length; i++){
            System.out.println("Digite os números para preencher o vetor 1 ");
            v1[i] = entrada.nextInt();
        }
        for (int i2 = 0; i2 <v2.length; i2++){
            System.out.println("Digite os números para preencher o vetor 2 ");
            v2[i2] = entrada.nextInt();
        }

        for (int i = 0; i< v1.length; i++) {
            v3[i] = v1[i];
        }
        for (int i = 0; i< v2.length; i++) {
            v3[i + 5] = v2[i];
        }

        System.out.println("\nVetor final:");

        for (int i = 0; i < v3.length; i++) {
            System.out.println(v3[i]);
        }
    }
}