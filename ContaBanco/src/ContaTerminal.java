
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criação do objeto Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        int numero;
        String agencia, nomeCliente;
        double saldo;

        // Solicitação e captura dos dados
        System.out.println("Por favor, digite o número da conta!");
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, digite um número válido para a conta!");
            scanner.next(); // Descarta o valor inválido
        }
        numero = scanner.nextInt(); // Lê o número da conta
        scanner.nextLine(); // Consumir a quebra de linha que fica pendente após nextInt()

        System.out.println("Por favor, digite o número da Agência!");
        agencia = scanner.nextLine(); // Lê a agência

        System.out.println("Por favor, digite o nome do Cliente!");
        nomeCliente = scanner.nextLine(); // Lê o nome do cliente

        System.out.println("Por favor, digite o saldo da conta!");
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, digite um valor numérico válido para o saldo!");
            scanner.next(); // Descarta o valor inválido
        }
        saldo = scanner.nextDouble(); // Lê o saldo

        // Exibição da mensagem com as informações inseridas
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                + "sua agência é " + agencia + ", conta " + numero + " e seu saldo "
                + saldo + " já está disponível para saque.");

        // Fechando o scanner
        scanner.close();
    }
}
