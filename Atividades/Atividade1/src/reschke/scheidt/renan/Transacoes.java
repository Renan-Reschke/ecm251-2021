/**
 *
 *  @author 19.02009-0 Renan Scheidt Reschke <renanreschke@hotmail.com>
 *
 */

package reschke.scheidt.renan;

import java.util.Random;

public class Transacoes {

    //Métodos de classe
    private static int getRandomNumberInRange(int min, int max) {       //Método para gerar um número aleatório
        Random r = new Random();                                        //Sera usado para criacao do QRCode
        return r.nextInt((max - min) + 1) + min;
    }

    public static String qrCode(Conta destinatario, double valor){      //Cria o QRCode no formato de String no formato:
        return String.format(destinatario.getIdConta() + ";" +          //"idConta;numeUsuario;valorTransacao;Random(1000-9999)"
                destinatario.getUsuario().getNome() + ";" +
                valor + ";" +
                getRandomNumberInRange(1000,9999));
    }

}
