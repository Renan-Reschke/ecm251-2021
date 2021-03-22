package reschke.scheidt.renan;

public class Contas {
    //Atributos
    private int idConta;
    private static int qntContas = 0;
    private double saldo;
    private Usuarios usuario;

    //Construtor
    public Contas(Usuarios usuario, double saldoInicial){
        this.usuario = usuario;
        this.saldo = saldoInicial;
        this.qntContas += 1;
        this.idConta = qntContas;
    }

    //Getters
    public int getIdConta() {           //Retorna o id da conta
        return idConta;
    }

    public double getSaldo() {          //Retorna o saldo da conta (double)
        return saldo;
    }

    public Usuarios getUsuario() {      //Retorna o usuário dono da conta
        return usuario;
    }

    //Métodos de Classe
    public static String formatarSaldo(double getSaldo) {       //Formata o salde de double para XXXX,XX
        return String.format("%.2f", getSaldo).replace('.', ',');
    }

    //toString - Retorna as informações do objeto como string
    @Override
    public String toString() {
        return "Contas{" +
                "idConta=" + idConta +
                ", saldo=" + saldo +
                ", usuario=" + usuario +
                '}';
    }
}
