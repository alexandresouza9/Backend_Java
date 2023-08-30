
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar  a classe Scanner
        Scanner sc = new main(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        //Exibir as mensagens para o nosso usuário
        System.out.println("=============CONTA BANCÁRIA===============");
        System.out.println();
        System.out.println("Por favor, digite o número da Conta: (1234)");
        numero = sc.next();

        System.out.println("Digite o número da Angência (123-8)");
        agencia = sc.next();

        System.out.printl("Digite o seu nome: ");
        nomeCliente = sc.next();
        sc.nextLine();

        //Obter pela scanner os valores digitados no terminal
        System.out.println("O seu saldo atual: ");
        saldo = sc.nextDouble();

        // Exibir a mensagem conta criada
        System.out.println();
        System.out.println("Olá %s, obrigado por escolher o nosso banco para abrir sua conta" + "sua agência é %s, " + "conta %d e seu saldo %.2f já está disponível " + "para saque", nomeCliente, agencia, numero, saldo );

        sc.close();
    }
}
