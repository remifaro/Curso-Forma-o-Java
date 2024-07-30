import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double valorAReceber = 0.0;
        double valorATransferir = 0.0;

        System.out.println("Informe seu nome completo: ");
        String nomeCompleto = leitura.nextLine();
        System.out.println("Informe seu tipo de conta: ");
        String tipoDeConta = leitura.nextLine();
        System.out.println("Informe seu saldo inicial: ");
        double saldoInicial = leitura.nextDouble();
        double saldoAtualizado = saldoInicial;

        System.out.println("\n***********************");
            System.out.println("Dados iniciais do cliente: \n\n");
            System.out.println("Nome: " + nomeCompleto);
            System.out.println("Tipo conta: " + tipoDeConta);
            System.out.println("Saldo inicial: R$ " + saldoInicial);
            System.out.println("***********************");
    
            System.out.println("\nOperações");
            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.println("\nDigite a opção desejada: ");
            int opcaoDesejada = leitura.nextInt();

        while(opcaoDesejada!=4){    
            System.out.println("\n\nOperações");
            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.println("\nDigite a opção desejada: ");
            opcaoDesejada = leitura.nextInt();
    
            if (opcaoDesejada == 1){
                System.out.println("Saldo atualizado R$ "+ saldoInicial);
            } else if(opcaoDesejada == 2){
                System.out.println("Informe o valor a receber:");
                valorAReceber = leitura.nextDouble();
                saldoAtualizado += valorAReceber;
                System.out.println("Saldo atualizado R$ "+ saldoAtualizado +"\n");
            } else if(opcaoDesejada == 3){
                System.out.println("Informe o valor que deseja transferir:");
                valorATransferir = leitura.nextDouble();
                    if(valorATransferir > saldoAtualizado){
                        System.out.println("Não há saldo suficiente para fazer essa transferência.\n");
                    } else{
                        saldoAtualizado -= valorATransferir;
                        System.out.println("Saldo atualizado R$ "+ saldoAtualizado +"\n");
                    }
            } else if(opcaoDesejada > 4) {
                System.out.println("Opção inválida");
            }
        }
    }
}
