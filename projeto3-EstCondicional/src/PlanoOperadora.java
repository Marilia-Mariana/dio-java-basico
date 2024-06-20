public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T";

        switch(plano){
            case "T":{
                System.out.println("5Gb Youtube");
            }
    // Não utilizamos break para que sejam impressas as outras alternativas também.

            case "M": {
                System.out.println("Whats e Instagram grátis");
            }
            
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }
    
}
