package exercicios.modelo.numero2;

public class ContaCorrente extends ContaBancaria {

    private double tarifa;

    public void cobrarTarifaMensal(){
        this.saldo -= tarifa;
    }

}
