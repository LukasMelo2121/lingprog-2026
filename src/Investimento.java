import java.util.Scanner;

public class Investimento {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor inicial:");
        double saldo = entrada.nextDouble();

        System.out.println("Digite a taxa de juros mensal (%):");
        double juros = entrada.nextDouble() / 100;

        for (int mes = 1; mes <= 12; mes++) {
            saldo = saldo + (saldo * juros);
            System.out.println("Mês " + mes + ": " + saldo);
        }
    }
}