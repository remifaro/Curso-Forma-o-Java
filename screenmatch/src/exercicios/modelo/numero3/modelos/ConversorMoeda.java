package exercicios.modelo.numero3.modelos;
import exercicios.modelo.numero3.novasInterfaces.ConversaoFinanceira;

public class ConversorMoeda implements ConversaoFinanceira {

    @Override
    public void converterDolarParaReal(double valorDolar){
        double valorReal = valorDolar * 5.64;
        System.out.println("O valor em reais é: R$"+ valorReal);
    }
}



