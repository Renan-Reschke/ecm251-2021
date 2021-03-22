/**
 *
 *  @author 19.02009-0 Renan Scheidt Reschke <renanreschke@hotmail.com>
 *  @author 19.01370-0 Felipe Freitas Villani <felipevillani.2000@hotmail.com>
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
    }

    public double getSaldo() {          //Retorna o saldo da conta (double)
        return saldo;
    }

    public Usuario getUsuario() {      //Retorna o usuário dono da conta
        return usuario;
    }

    //Métodos de Classe
    public static String formatarSaldo(double getSaldo) {                           //Formata o sald0 de double para "XXXX,XX"
        return String.format("%.2f", getSaldo).replace('.', ',');
    }

    public boolean pagar(String QRCode){
        String[] dados = QRCode.split(";");
        if(this.saldo >= Double.parseDouble(dados[2])){                                                         //Verifica se o saldo do pagador é suficiente para pagar
            if(listaDeContas.contas[Integer.parseInt(dados[0])-1].idConta == Integer.parseInt(dados[0])         //Verificação da validade da conta de destino
                    && listaDeContas.contas[Integer.parseInt(dados[0])-1].usuario.getNome().equals(dados[1])) {
                this.saldo -= Double.parseDouble(dados[2]);                                                     //Faz a dedução do valor pago da conta do pagador
                listaDeContas.contas[Integer.parseInt(dados[0]) - 1].saldo += Double.parseDouble(dados[2]);     //Adiciona os fundo na conta destino
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

