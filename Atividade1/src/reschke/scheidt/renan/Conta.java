/**
 *
 *  @author 19.02009-0 Renan Scheidt Reschke <renanreschke@hotmail.com>
 *
 */

package reschke.scheidt.renan;

import java.util.Objects;

public class Conta {

    //Atributos
    private int idConta;
    private double saldo;
    private Usuario usuario;
    private static int qntContas = 0;

    //Construtor
    public Conta(Usuario usuario, double saldoInicial){
        this.usuario = usuario;
        this.saldo = saldoInicial;
        this.qntContas += 1;
        this.idConta = this.qntContas;
    }

    //Getters
    public int getIdConta() {           //Retorna o id da conta
        return idConta;
    }       //Permite acesso ao id da conta

    public double getSaldo() {          //Retorna o saldo da conta (double)
        return saldo;
    }        //Permite acesso ao saldo da conta

    public Usuario getUsuario() {      //Retorna o usuário dono da conta
        return usuario;
    }   //Permite acesso ao usuario dono da conta

    //Métodos de Classe
    public static String formatarSaldo(double getSaldo) {   //Formata o sald de double para "XXXX,XX"

        return String.format("%.2f", getSaldo).replace('.', ',');
    }

    public boolean pagar(String qrCode){
        String[] dados = qrCode.split(";");
        if(this.saldo >= Double.parseDouble(dados[2])){                                                         //Verifica se o saldo do pagador é suficiente para pagar
            if(listaDeContas.getConta(Integer.parseInt(dados[0])).idConta == Integer.parseInt(dados[0])         //Verificação da validade da conta de destino
                    && listaDeContas.getConta(Integer.parseInt(dados[0])).usuario.getNome().equals(dados[1])) {
                this.saldo -= Double.parseDouble(dados[2]);                                                     //Faz a dedução do valor pago da conta do pagador
                listaDeContas.getConta(Integer.parseInt(dados[0])).saldo += Double.parseDouble(dados[2]);     //Adiciona os fundo na conta destino
            } else {return false;}
            return true;
        } return false;
    }

    @Override
    public String toString() {          //Retorna as informações do objeto como string
        return "Contas{" +
                "idConta=" + idConta +
                ", saldo=" + saldo +
                ", usuario=" + usuario +
                '}';
    }
}

