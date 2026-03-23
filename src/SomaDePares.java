import java.util.Scanner;

public class SomaDePares {
    public static void main(String[] args) {

        Scanner entrada  = new Scanner(System.in);

        int soma = 0;

        for (int i=0; i < 8; i++  ){
            System.out.println("Digite os números, apenas os pares serão somados, caso queira parar digite 0.");
            int n = entrada.nextInt();

            if ( n % 2 == 0) {
            soma += n;
            }
         }
        System.out.println("O total dos números pares somados é " + soma);
    }
}