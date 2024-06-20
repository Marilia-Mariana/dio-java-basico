

public class ResultadoEscolar {

    public static void main(String[] args) {

System.out.println("Estrutura Condicional Composta");

        double nota = 5;

        if (nota > 6) {
            System.out.println("Aprovado.");
        } else {
            if (nota >= 4) { 
                System.out.println("Recuperação");
            } else
            System.out.println("Reprovado!"); //else sem chaves se tiver apenas uma linha
        }

        //Correção do professor: condição nova não interfere na estrutura já pronta.

        if (nota >= 7)
            System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7)
            System.out.println("Prova de Recuperação");        

        else
            System.out.println("Reprovado");
    }

    
}
