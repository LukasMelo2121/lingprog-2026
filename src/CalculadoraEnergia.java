import java.util.Scanner;

public class CalculadoraEnergia {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //entrada de dados
        System.out.println("Informe o Nome do cliente.");
        String nome = scanner.nextLine();
        System.out.println("Informe a mediação de consumo anterior.");
        double consumoAnterior = scanner.nextDouble();
        System.out.println("Informe a medição atual.");
        double consumoAtual = scanner.nextDouble();

        if (consumoAtual < consumoAnterior) {
            System.out.println("Erro: A leitura não pode ser menor que a anterior");
        return;
    }

        //cosumo
        double consumo = consumoAtual - consumoAnterior;
        double valorBruto = consumo * 0.60;

        //
        String bandeira;
        double adicional;

        if (consumo <= 100) {
            bandeira = "Verde";
            adicional = 0;
        } else if (consumo <= 200) {
            bandeira = "Amarela";
            adicional = 2.00;
        } else if (consumo <= 300) {
            bandeira = "Vermelha";
            adicional = 5.00;
        } else {
            bandeira = "Preta";
            adicional = 10.00;
        }

        double valorFinal = valorBruto + adicional;

        // e se o consumo for zero? casa vazia, todos foram viajar. A CPFL cobra uma taxa minima.
        if (valorFinal < 30){
            valorFinal = 30;
        }

        System.out.println("------RESUMO DA CONTA------");
        System.out.println("Cliente: " + nome);
        System.out.println("Consumo: " + consumo + " Kwh");
        System.out.println("Bandeira: " + bandeira);
        System.out.printf("Valor Final: R$ %.2f\n", valorFinal);

        scanner.close();
    }
}
