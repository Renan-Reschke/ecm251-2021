package reschke.scheidt.renan;

public class Contas {
    //Atributos
    private int idConta;
    private static int qntContas = 0;
    private double saldo;
    private Usuarios usuario;

    //Construtor
    public Contas(Usuarios usuario){
        this.usuario = usuario;
        this.saldo = 0.00;
        this.qntContas += 1;
        this.idConta = qntContas;
    }
    public void verificarIdConta(){
        System.out.println("id: "+ this.idConta);
    }
}
