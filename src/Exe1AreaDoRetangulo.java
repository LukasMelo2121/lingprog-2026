import java.util.Scanner;

public class Exe1AreaDoRetangulo
    {
        public static double calcularAreaRetangulo(double base, double altura){
            return (base * altura);
        }

        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Informe a base");
            double base = entrada.nextDouble();
            System.out.println("Informe a altura");
            double altura = entrada.nextDouble();
            System.out.println("Área do retangulo: " + calcularAreaRetangulo(base, altura));

       }
    }
