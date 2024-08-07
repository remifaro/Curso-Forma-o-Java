package br.com.alura.screenmatch.calculo.Classificavel;
package br.com.alura.screenmatch.modelos;

public class Filme extends Titulo implements Classificavel {

    private String diretor;

    public void setDiretor(String diretor){
        this.diretor = diretor;
    }

    public String getDiretor(){
        return diretor;
    }
    
    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2; // Precisei utilizar o Casting
    }
}



