package reschke.scheidt.renan;

public class Conta {
    //Atributos
    Cliente cliente = new Cliente();
    double saldo;
    int numero;

    //Métodos da classe
    void depositar(double valor){
        this.saldo += valor;
    }

    boolean sacar(double valor){
        if (valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    boolean transferirDinheiro(double valor, Conta destino){
        if (this.sacar(valor)) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    void visualizarSaldo(){
        System.out.println(String.format("Saldo = R$%.2f", this.saldo).replace('.', ','));
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

