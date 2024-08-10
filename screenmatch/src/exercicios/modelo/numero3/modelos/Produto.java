package exercicios.modelo.numero3.modelos;

import exercicios.modelo.numero3.novasInterfaces.Vendavel;

public class Produto implements Vendavel{

    private String nome;
    public double precoUnitario;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPrecoUnitario(double precoUnitario){
        this.precoUnitario = precoUnitario;
    }

    public String getNome(){
        return nome;
    }

    public double getPrecoUnitario(){
        return precoUnitario;
    }

    @Override
    public double calcularPrecoTotal(int quantidade){
        return precoUnitario * quantidade;
    }

    @Override
    public void aplicarDescontos(double percentualDesconto){
        precoUnitario -= precoUnitario * (percentualDesconto/100.0);
    }
}


