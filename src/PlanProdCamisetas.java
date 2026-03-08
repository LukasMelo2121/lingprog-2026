import java.util.Scanner;

public class PlanProdCamisetas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantidade de camisas feitas: ");
        int qtdCamisetas = entrada.nextInt();

        System.out.println("Quantidade de camisetas vendidas: ");
        int qtdVendida = entrada.nextInt();

        float custo = calcularCusto(qtdCamisetas);
        System.out.println("Custo total: " + custo);

        float receita = calcularReceita(qtdVendida);
        System.out.println("A receita é: " + receita);

        float lucro = receita - custo;
        System.out.println("O Lucro foi de: " + lucro);

    }

    public static float calcularCusto(int qtdCamisetas) {
        float custo = 15.0f * qtdCamisetas + 200.0f;
        return custo;
    }

    public static float calcularReceita(int qtdVendida) {
        float receita = 35.0f * qtdVendida;
        return receita;
    }
}
