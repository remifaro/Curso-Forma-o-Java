package exercicios.modelo.numero1;


public class Aluno{
    private String nome;
    private double nota;
    private double somaDasNotas;
    private int quantidadeNotas;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNotas(double nota){
        this.nota = nota;
        somaDasNotas += nota;
        quantidadeNotas++;
    }

    public void calcularMedia(){
        System.out.println("A média é: " + somaDasNotas/quantidadeNotas);
    }
}