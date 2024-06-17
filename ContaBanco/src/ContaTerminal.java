import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        //TODO: Conhecendo scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Recebendo informações do usuário
        System.out.println("Por favor, digite o número da Agência: ");
        int agencia = scanner.nextInt();

        System.out.println("Digite o número da conta: ");
        int numConta = scanner.nextInt();

        System.out.println("Digite seu Nome e Sobrenome: ");
        String clientName = scanner.next();
        String clientLastName = scanner.next();
        

        System.out.println("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        String completeName = completeName(clientName, clientLastName);

        // Exibindo informações inseridas ao usuário
        System.out.println("Olá " + completeName + ", obrigado por criar uma conta em nosso banco, sua Agencia é " + agencia + ", Conta "+ numConta + " e seu Saldo de R$ " + saldo + " já está disponível para saque.");

    }

    public static String completeName (String clientName, String clientLastName){
        return clientName.concat(" ").concat(clientLastName);
    }

}