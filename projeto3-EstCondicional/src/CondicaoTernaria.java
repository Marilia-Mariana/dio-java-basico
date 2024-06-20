public class CondicaoTernaria {
    public static void main(String[] args) {
        double nota = 5.6;

        //Condional ternário composto
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        //Condicional ternário Encadeada
        String resultado2 = nota >=7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado2);

    }
}
