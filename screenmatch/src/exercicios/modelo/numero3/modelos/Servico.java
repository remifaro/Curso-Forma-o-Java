package exercicios.modelo.numero3.modelos;

import exercicios.modelo.numero3.novasInterfaces.Vendavel;

public class Servico implements Vendavel{

    private String descricao;
    private double precoHora;

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setPrecoHora(double precoHora){
        this.precoHora = precoHora;
    }

    public String getDescricao(){
        return descricao;
    }

    public double getPrecoHora(){
        return precoHora;
    }

    @Override
    public double calcularPrecoTotal(int quantidade){
        return precoHora * quantidade;
    }

    @Override
    public void aplicarDescontos(double percentualDesconto){
        precoHora -= precoHora * (percentualDesconto/100);
    }

}
