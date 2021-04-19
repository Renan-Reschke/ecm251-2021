package reschke.scheidt.renan;

public class Main {

    public static void main(String[] args) {
	    //Cria e instancia um objeto do tipo conta
        Conta c1 = new Conta();
        Conta c2 = new Conta();

        //Pede para exibir o saldo
        c1.visualizarSaldo();

        //Modificar o saldo
        c1.saldo = 100;
        c1.sacar(50);

        c1.visualizarSaldo();

    }
}