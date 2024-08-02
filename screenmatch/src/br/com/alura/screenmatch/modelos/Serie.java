package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {

    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpisodio;

    public int getTemporadas(){
        return temporadas;
    }

    public int getEpisodiosPorTemporada(){
        return episodiosPorTemporada;
    }

    public boolean getAtiva(){
        return ativa;
    }

    public int getMinutosPorEpisodio(){
        return minutosPorEpisodio;
    }

    public void setTemporadas(int temporadas){
        this.temporadas = temporadas;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada){
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public void setAtiva(boolean ativa){
        this.ativa = ativa;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio){
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
}