import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("******************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo Conta: " + tipoConta);
        System.out.println("Saldo Atual: R$" + saldo);
        System.out.println("\n******************");

        String menu = """
                ** Digite sua opção **
                1 - Consulta de Saldo
                2 - Transferência
                3 - Receber Valor
                4 - Sair
                """;

    Scanner leitura = new Scanner(System.in);


        while(opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if(opcao == 1){
                System.out.println("Salto disponível de R$ " + saldo);
            } else if (opcao == 2){
                System.out.println("Qual o valor de tranferencia desejado? ");
                double valor = leitura.nextDouble();
                if(valor > saldo){
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo -= valor;
                    System.out.println("Saldo Atual: R$" + saldo);
                }
            } else if (opcao == 3){
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Saldo Atual: R$" + saldo);
            } else if (opcao != 4){
                System.out.println("Opção Inválida, vamos tentar novamente...");
            }

        }

    }
}
