package exercicios.modelo.numero2;

public class ContaBancaria {

    protected double saldo;

    public void depositar(double deposito){
        this.saldo += deposito;
    }

    public void sacar(double saque){
        this.saldo -= saque;
    }

    public double consultarSaldo(){
        return saldo;
    }
}
