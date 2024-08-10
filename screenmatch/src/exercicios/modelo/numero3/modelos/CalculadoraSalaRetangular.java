package exercicios.modelo.numero3.modelos;
import exercicios.modelo.numero3.novasInterfaces.CalculoGeometrico;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public void calcularArea(double altura, double largura){
        double valorArea = altura * largura;
        System.out.println("O valor da área é: " + valorArea);
    }

    @Override
    public void calcularPerimetro(double altura, double largura){
        double valorPerimetro = altura * 2 + largura * 2;
        System.out.println("O valor do perímetro é: " + valorPerimetro);
    }
}
