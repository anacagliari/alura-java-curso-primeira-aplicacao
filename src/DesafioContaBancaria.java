import java.util.Scanner;

public class DesafioContaBancaria {
    public static void main(String[] args) {
        String nome;
        String tipoConta;
        double saldoAtual = 0.0;
        int opcao = 0;
        Scanner leitura = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        nome = leitura.nextLine();
        
        System.out.println("Digite o tipo da conta [Corrente | Poupança]: ");
        tipoConta = leitura.nextLine();
        
        System.out.println("Informe o saldo da conta: ");
        saldoAtual = leitura.nextDouble();
        
        double saldoAtualizado = saldoAtual;

        System.out.println(String.format("""

                **************************

                Dados iniciais do cliente:

                Nome: %s
                Tipo conta: %s
                Saldo: R$ %.2f
                """, nome, tipoConta, saldoAtual));

        String menu = """
                    **************************

                    Operações

                    1- Consultar saldo
                    2- Depositar valor
                    3- Transferir valor
                    4- Sair

                    **************************

                    Digite a opção desejada:
                    """;

        while (opcao != 4) {
            System.out.print(menu);
            opcao = leitura.nextInt();
            if (opcao == 1) { // consultar
                System.out.println(String.format("""

                    --> Saldo: R$ %.2f
                    """, saldoAtualizado));
            } else if (opcao == 2) { // despositar
                System.out.println("Informe o valor para depósito: ");
                double valorRecebido = leitura.nextDouble();
                saldoAtualizado += valorRecebido;
                System.out.println(String.format("""

                    --> Saldo atual: R$ %.2f
                    --> Valor depositado: R$ %.2f
                    --> Saldo atualizado: R$ %.2f
                    """, saldoAtual, valorRecebido, saldoAtualizado));
                saldoAtual = saldoAtualizado;
            } else if (opcao == 3) { // transferir
                System.out.println("Informe o valor para tranferência: ");
                double valorTransferido = leitura.nextDouble();
                if (valorTransferido > saldoAtualizado) {
                    System.out.println("""
                            
                    Saldo insuficiente.
                            """);
                } else {
                    saldoAtualizado -= valorTransferido;
                    System.out.println(String.format("""
    
                        --> Saldo atual: R$ %.2f
                        --> Valor transferido: R$ %.2f
                        --> Saldo atualizado: R$ %.2f
                        """, saldoAtual, valorTransferido, saldoAtualizado));
                    saldoAtual = saldoAtualizado;
                }
            } else if (opcao == 4) {
                System.out.println(String.format("""

                    --> Obrigado %s por utilizar nosso serviço!
                        """, nome));
            } else {
                System.out.println("Opção inválida.");
            }
        }

        leitura.close();

    }
}
