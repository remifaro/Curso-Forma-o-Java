package exercicios.modelo.numero3.modelos;

import exercicios.modelo.numero3.novasInterfaces.ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    @Override
    public void celsiusParaFahrenheit(double grausCelsius){
        double resultadoF = (grausCelsius * 1.8) + 32;
        System.out.println(resultadoF + " graus Fahrenheit"); 
    }

    public void fahrenheitParaCelsius(double grausFahrenheit){
        double resultadoC = (grausFahrenheit - 32)/1.8;
        System.out.println(resultadoC + " graus Celsius"); 
    }
}
