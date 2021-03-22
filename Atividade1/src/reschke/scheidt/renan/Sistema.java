package reschke.scheidt.renan;

public class Sistema {
    public static String formatarSaldo(double getSaldo) {       //Formata o salde de double para XXXX,XX
        return String.format("%.2f", getSaldo).replace('.', ',');
    }
}
