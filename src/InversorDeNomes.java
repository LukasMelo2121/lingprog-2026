import java.util.Scanner;

public class InversorDeNomes {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome[] = new String[5];

        for (int i = 0; i <nome.length; i++){

            System.out.println("Digite o nome ");
             nome[i] = entrada.nextLine();
        }
        for (int i = nome.length - 1; i >=0; i--){
            System.out.println(nome[i]);
        }
    }
}
