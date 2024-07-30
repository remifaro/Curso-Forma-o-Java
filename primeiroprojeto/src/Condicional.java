public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = false;
        // double notaDoFilme = 8.1;
        String tipoPlano = "PLUS";

        if(anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filmes antigos que valem a pena assistir!");
        }

        if(incluidoNoPlano && tipoPlano.equals("PLUS")){
        // if(incluidoNoPlano || tipoPlano.equals("PLUS")){
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar locação!");
        }
    }
}
