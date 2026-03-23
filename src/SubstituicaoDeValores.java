import java.util.Scanner;

public class SubstituicaoDeValores {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n[] = new int[10];
        for (int i=0; i < n.length; i++) {

            System.out.println("Digite 10 números");
            n[i] = entrada.nextInt();

            if (n[i] <0) {
                n[i] = 0;
            }
        }
        for (int i=0; i <n.length; i++) {
            System.out.println(n[i]);
        }
    }
}