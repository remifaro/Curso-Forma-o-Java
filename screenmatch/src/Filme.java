public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    // É void pois não retorna nada
    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Está incluído no plano? " + incluidoNoPlano);
        System.out.println("Avaliação Geral: " + somaDasAvaliacoes);
        System.out.println("Total de avaliações: " + totalDeAvaliacoes);
        System.out.println("Tempo de duração em minutos: " + duracaoEmMinutos);
    }

    // É void pois não retorna nada
    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    // Não é void pois ele retorna algo, que no caso é um double
    double pegaMedia(){
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }
}
