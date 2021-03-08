package reschke.scheidt.renan;

public class Conta {
    //Atributos
    String titular, cpf;
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
}
