
import java.util.Scanner;


public class Desafio {
    
    public static void main(String[] args) throws Exception {

        Scanner leitorDeEntradas = new Scanner(System.in);

        System.out.println("Insira o salário bruto: ");
        float salarioBruto = leitorDeEntradas.nextFloat();

        System.out.println("Adicional dos benefícios: ");
        float adicionalBeneficios = leitorDeEntradas.nextFloat();

        float imposto = 0;
        if (salarioBruto >= 0 && salarioBruto <= 1100) {
            imposto = 5/100F * salarioBruto;
        } else {
            if (salarioBruto >= 1100.01 && salarioBruto <= 2500){
                imposto = 10/100F * salarioBruto;
            } else {
                imposto = 15/100F * salarioBruto;
            }

        }
        float salarioLiquido = salarioBruto + adicionalBeneficios - imposto;
        System.out.println(String.format("%.2f",salarioLiquido));
    }
   /* static float calcularSalario (float salarioBruto) {

        return;
    }*/

}
