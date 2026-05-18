import java.util.Scanner;

public class Loop {
    public static void main(String [] args){

        Scanner entrada =  new Scanner(System.in);

        String nome = "";
        float nota = 0;
        float soma = 0;

        int condicao = 1;
        while (condicao <= 10){
            System.out.println("Informe o nome: ");
            nome = entrada.next();
            System.out.println("Informe a nota: ");
            nota = entrada.nextFloat();
            if (nota < 0 || nota >10 ){
                break;
            }
            soma = soma+nota;
            condicao++;
        }
        if (condicao == 11) {
            float media = soma / 10;
            System.out.println("A média é: " + media);
        }
        else {
            System.out.println("Nota negativa não pode");
        }
    }
}
