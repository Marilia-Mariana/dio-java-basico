
import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        Double saldoDisponivel = 105.3;

        System.out.println("Praticando Estruturas Condicionais em Java");

        System.out.println("Qual valor deseja sacar? ");
        Double valorSolicitado = scanner.nextDouble();

        if (valorSolicitado > saldoDisponivel) {
            System.out.println("Saldo Insuficiente!");  
            // Até aqui é uma estrutura condicional simples
        } else {
            saldoDisponivel = saldoDisponivel - valorSolicitado;
            System.out.println("A operação foi efetuada! O saldo atual é de R$ "+saldoDisponivel);
        }

    
    }
}
