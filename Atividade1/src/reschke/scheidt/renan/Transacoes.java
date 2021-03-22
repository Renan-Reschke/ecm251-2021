package reschke.scheidt.renan;

import java.util.Random;

public class Transacoes {

    //Método para gerar um número aleatório
    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    //Método para gerar a String QRCode
    private static String QRCode(Contas destinatario, double valor){
        return String.format(destinatario.getIdConta() + ";" +
                destinatario.getUsuario().getNome() + ";" +
                valor + ";" +
                getRandomNumberInRange(1000,9999))
    }

}
