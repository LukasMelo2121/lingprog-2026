import java.util.Scanner;

public class ValidaçãoNota {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma nota entre 0 e 10:");
        double nota = entrada.nextDouble();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Digite novamente:");
            nota = entrada.nextDouble();
        }

        System.out.println("Nota válida: " + nota);
    }
}
