//19.02009-0 Renan Scheidt Reschke
package reschke.scheidt.renan;

import java.util.Objects;

public class Conta {
    //Atributos
    private int idConta;
    private double saldo;
    private Usuario usuario;

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Construtor
    public Conta(Usuario usuario, double saldoInicial){
        this.usuario = usuario;
        this.saldo = saldoInicial;
        listaDeContas.qntContas += 1;
        this.idConta = listaDeContas.qntContas;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Getters
    public int getIdConta() {           //Retorna o id da conta
        return idConta;
    }

    public double getSaldo() {          //Retorna o saldo da conta (double)
        return saldo;
    }

    public Usuario getUsuario() {      //Retorna o usuário dono da conta
        return usuario;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Métodos de Classe
    public static String formatarSaldo(double getSaldo) {       //Formata o salde de double para XXXX,XX
        return String.format("%.2f", getSaldo).replace('.', ',');
    }

    public boolean pagar(String QRCode){
        String[] dados = QRCode.split(";");
        Conta destinatario;
        if(this.saldo >= Double.parseDouble(dados[2])){
            this.saldo -= Double.parseDouble(dados[2]);
            listaDeContas.contas[Integer.parseInt(dados[0])-1].saldo += Double.parseDouble(dados[2]);
            return true;
        } return false;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //toString - Retorna as informações do objeto como string
    @Override
    public String toString() {
        return "Contas{" +
                "idConta=" + idConta +
                ", saldo=" + saldo +
                ", usuario=" + usuario +
                '}';
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //hashCode e equals

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Conta)) return false;
        Conta conta = (Conta) obj;
        return idConta == conta.idConta && usuario.equals(conta.usuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idConta, usuario);
    }
}

