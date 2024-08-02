// Desenvolva uma classe Aluno com os atributos privados nome e notas. 
// Utilize métodos getters e setters para acessar e modificar esses atributos. 
// Adicione um método calcularMedia que retorna a média das notas do aluno.

public class Aluno{
    private String nome;
    private double nota;
    private int quantidadeNotas;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNotas(double nota){
        this.nota = nota;
        double somaDasNotas += nota;
        quantidadeNotas++;
    }

    public void calcularMedia(){
        System.out.println("A média é: " + somaDasNotas/quantidadeNotas);
    }
}