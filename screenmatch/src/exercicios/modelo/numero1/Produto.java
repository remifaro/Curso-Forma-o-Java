package exercicios.modelo.numero1;
// Desenvolva uma classe Produto com os atributos privados nome e preco. 
// Utilize métodos getters e setters para acessar e modificar esses atributos. 
// Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.

public class Produto{
    private String nome;
    private double preco;
    private double desconto;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public void aplicarDesconto(int valorPercentual){
        desconto = preco*(valorPercentual/100);
        preco -= desconto;
    }
}

