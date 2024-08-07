package exercicios.modelo.numero1;
// Desenvolva uma classe Livro com os atributos privados titulo e autor. 
// Utilize métodos getters e setters para acessar e modificar esses atributos. 
// Adicione um método exibirDetalhes que imprime o título e o autor do livro.

public class Livro {
    private String titulo;
    private String autor;

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void exibirDetalhes(){
        System.out.println("Título do livro: " + titulo);
        System.out.println("Autor: " + autor);
    }
}