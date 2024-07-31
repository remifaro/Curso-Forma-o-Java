package br.com.alura.screenmatch.modelos;

public class Filme {
    public String nome;
    public int anoDeLancamento;
    public boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    // É void pois não retorna nada
    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Está incluído no plano? " + incluidoNoPlano);
        System.out.println("Avaliação Geral: " + somaDasAvaliacoes);
        System.out.println("Total de avaliações: " + totalDeAvaliacoes);
        System.out.println("Tempo de duração em minutos: " + duracaoEmMinutos);
    }

    // É void pois não retorna nada
    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    // Não é void pois ele retorna algo, que no caso é um double
    public double pegaMedia(){
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }
}
