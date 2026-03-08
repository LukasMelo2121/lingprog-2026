import java.util.Scanner;

public class PlanProdCamisetas2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a quantidade de camisetas produzidas?");
        int prodCamisetas = entrada.nextInt();

        double lucro = calcularLucro(prodCamisetas);

        if (lucro >= 0) {
            System.out.println("Seu lucro foi de: " + lucro);

        }
        else {System.out.println("A empresa teve um prejuízo de: " + (Math.abs(lucro)) + "R$");
        }

        int qtdIdeal = (int) calcularQuantidadeIdeal();
        System.out.println("A quantidade ideal a ser produzida para maximizar o lucro é de: " + qtdIdeal);

    }
    public static double calcularLucro(int prodCamisetas) {
        double lucro = -0.05 * prodCamisetas * prodCamisetas + 40.0 * prodCamisetas - 500.0;
        return lucro;}

    public static double calcularQuantidadeIdeal() {
        double qtdIdeal =  -40.0 / (2 * -0.05);
        return qtdIdeal;}

}

