import java.util.Scanner;


public class TabuadaPerso {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        String continuar = "S";

        while (continuar.equalsIgnoreCase("S")) {

            System.out.println("Você quer a tabuada de qual número? ");
            double tabuada = entrada.nextDouble();

            System.out.println("Tabuada");

            for (int multi = 1; multi < 11; multi++) {
                double resultado = tabuada * multi;
                System.out.println(" " + tabuada + " x " + multi + " = " + resultado);

            }
            System.out.println("Quer calcular outra Tabuada? Digite S/N");
            continuar = entrada.next();
        }

    }
}
