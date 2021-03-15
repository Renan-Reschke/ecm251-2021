package reschke.scheidt.renan;

public class Conta {
    //Atributos
    private Cliente cliente = new Cliente();
    private double saldo;
    private int numero;

    //Métodos da classe
    public void depositar(double valor){
        this.saldo += valor;
    }

    public boolean sacar(double valor){
        if (valor <= this.saldo){
            this.saldo -= valor;
            return true;
        } return false;
    }

    public boolean transferirDinheiro(double valor, Conta destino){
        if (this.sacar(valor)) {
            destino.depositar(valor);
            return true;
        } return false;
    }

    public double visualizarSaldo(){
        return this.saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "cliente=" + cliente.toString() +
                ", saldo=" + saldo +
                ", numero=" + numero +
                '}';
    }
}

