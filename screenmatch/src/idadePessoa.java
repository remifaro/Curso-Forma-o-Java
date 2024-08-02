// Crie uma classe idadePessoa com os atributos privados nome e idade. 
// Utilize métodos getters e setters para acessar e modificar esses atributos. 
// Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.

public class idade{
    private String nome;
    private int idade;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public void verificarIdade(){
        if(idade>=18){
            system.out.println("É maior de idade");
        } else{
            system.out.println("Não é maior de idade");
        }
    }
}