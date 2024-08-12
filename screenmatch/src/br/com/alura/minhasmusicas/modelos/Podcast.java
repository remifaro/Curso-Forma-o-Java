package br.com.alura.minhasmusicas.modelos;

public class Podcast extends Audio{
    private String apresentador;
    private String descricao;

    public void setApresentador(String apresentador){
        this.apresentador = apresentador;
    }

    public String getApresentador(){
        return apresentador;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalCurtidas() > 500){
            return 10;
        } else {
            return 8;
        }
    }
}
