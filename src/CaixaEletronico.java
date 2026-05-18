import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcao = 0;
        float valor = 0;
        float saldo = 0;

        do {
            System.out.println("Digite uma das opções: " +
                    "\n 1.Consultar saldo. " +
                    "\n 2.Depositar. " +
                    "\n 3.Sacar. " +
                    "\n 4.Sair. ");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Saldo da conta " + saldo);
                    break;
                case 2:
                    System.out.println("Informe valor de depósito");
                    valor = entrada.nextFloat();
                    saldo += valor;
                    System.out.println("Depósito realizado com sucesso");
                    break;
                case 3:
                    System.out.println("Informe o saque");
                    valor = entrada.nextFloat();
                    if (valor <= saldo) {
                        saldo -= valor;
                        System.out.println("Saque realizado com sucesso");
                        break;
                    } else System.out.println("Saldo insuficiente");
                    break;
                case 4:
                    System.out.println("Pagamento encerrado");
                    break;
                default:
                    System.out.println("opção invalida");
            }
        }
        while (opcao != 4);
    }
}