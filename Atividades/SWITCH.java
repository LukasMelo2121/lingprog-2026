import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;

public class SWITCH {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite A, CADASTRAR B, CONSULTAR C, SAIR");
        String opcao = entrada.next();
        switch(opcao) {
            case "A":
                System.out.println("Cadastro realizado com sucesso");
                break;
            case "B":
                System.out.println("Consulta realizada com sucesso");
                break;
            case "C":
                System.out.println("Programa será encerado");
                break;
            default:
                System.out.println("Opção Inválida");
        }
    }
}