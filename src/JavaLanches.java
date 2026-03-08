import java.util.Scanner;

public class JavaLanches {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("-----------Cardápio----------");
        System.out.println("-----------------------------");
        System.out.println("---101 - Hot Dog-------------");
        System.out.println("---102 - x-Burguer-----------");
        System.out.println("---103 - x-Salada------------");

        System.out.println("Digie o código do produto");
        int opcao = entrada.nextInt();

        double preco = 0;

        switch (opcao) {
            case 101:
                preco = 10.0;
            System.out.println("Preço: "+ preco + "R$");
            break;
            case 102:
                preco = 15.00;
                System.out.println("Preço: "+ preco + "R$");
                break;
            case 103:
                preco = 12.00;
                System.out.println("Preço: "+ preco + "R$");
                break;
            default:
                System.out.println("Produto inválido");
        }

        if (preco > 0) {

            System.out.println("Qual sua idade?");
            int idade = entrada.nextInt();

            double precoFinal;

            if (idade < 12) {
                precoFinal = preco * 0.5;
            }
            else if (idade <= 60) {
                precoFinal = preco;
            }
            else {
                precoFinal = preco * 0.7;
            }

            System.out.println("Valor final do pedido: R$ " + precoFinal);
        }

    }
}






