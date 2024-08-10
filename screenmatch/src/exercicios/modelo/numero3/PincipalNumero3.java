package exercicios.modelo.numero3;

import exercicios.modelo.numero3.modelos.CalculadoraSalaRetangular;
import exercicios.modelo.numero3.modelos.ConversorMoeda;
import exercicios.modelo.numero3.modelos.ConversorTemperaturaPadrao;
import exercicios.modelo.numero3.modelos.TabuadaMultiplicacao;


public class PincipalNumero3 {
    public static void main(String[] args) {

        CalculadoraSalaRetangular calculadoraParaArquiteto = new CalculadoraSalaRetangular();
        calculadoraParaArquiteto.calcularArea(2, 13.94);
        calculadoraParaArquiteto.calcularPerimetro(2, 13.94);

        ConversorMoeda conversorRemi = new ConversorMoeda();
        conversorRemi.converterDolarParaReal(2);

        TabuadaMultiplicacao tabuadaNova = new TabuadaMultiplicacao();
        tabuadaNova.mostrarTabuada(8);

        ConversorTemperaturaPadrao novaTemperatura = new ConversorTemperaturaPadrao();
        novaTemperatura.celsiusParaFahrenheit(23);
        novaTemperatura.fahrenheitParaCelsius(87.73);
        
    }
}
