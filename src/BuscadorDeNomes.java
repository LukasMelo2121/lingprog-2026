import java.util.Scanner;

public class BuscadorDeNomes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String n[] = new String[10];

        for (int i = 0; i< n.length; i++){
                System.out.println("Digite os nomes ");
                n[i] = entrada.nextLine();
            }

            String nomeBuscado;

            System.out.println("Deseja buscar qual nome?");
            nomeBuscado = entrada.nextLine();

            boolean encontrou = false;

        for (int i = 0; i< n.length; i++){
            if (n[i].equals(nomeBuscado)){
                    encontrou = true;
            }
        }
        if (!encontrou){
            System.out.println("Não encontrado.");
        }
    }
}