import java.util.Scanner;

public class Exe2VerificadorDePariedade {
    public static boolean EhPar(int nTeste){
        return (nTeste % 2 == 0);

    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um número");
        int VouF = entrada.nextInt();
        System.out.println(EhPar(VouF));
    }
}

