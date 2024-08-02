package br.com.alura.screenmatch.modelos;

class public Titulo{
public String nome;
    public int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public String getNome(){
        return nome;
    }

    public int getAnodeLancamento(){
        return anoDeLancamento;
    }

    public boolean getIncluidoNoPlano(){
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }

    public void setNome(nome){
        this.nome = nome;
    }

    public void setAnoDeLancamento(anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(incluidoNoPlano){
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(set duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
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