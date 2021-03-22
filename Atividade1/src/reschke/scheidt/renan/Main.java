//19.02009-0 Renan Scheidt Reschke
package reschke.scheidt.renan;

public class Main {

    public static void main(String[] args) {
        //Criação dos usuários - OK
        Usuarios u1 = new Usuarios("Allmight","12345678", "Allmight@gmail.com");
        Usuarios u2 = new Usuarios("One For All", "12345678", "OneForAll@gmail.com");
        Usuarios u3 = new Usuarios("Bakugo", "12345678", "Bakugo@gmail.com");

        //Criação das Contas - OK
        Contas c1 = new Contas(u1,1000.0);
        Contas c2 = new Contas(u2,250.0);
        Contas c3 = new Contas(u3,3000.0);

        //Verificação do estado INICIAL - OK
        System.out.println("Estado inicial:");
        System.out.println("Nome usuário: " + c1.getUsuario().getNome() + " - Saldo: " + Contas.formatarSaldo(c1.getSaldo()));
        System.out.println("Nome usuário: " + c2.getUsuario().getNome() + " - Saldo: " + Contas.formatarSaldo(c2.getSaldo()));
        System.out.println("Nome usuário: " + c3.getUsuario().getNome() + " - Saldo: " + Contas.formatarSaldo(c3.getSaldo()));

        //Operações de teste

        //Verificação do estado FINAL
        System.out.println("Estado final:");
        System.out.println("Nome usuário: " + c1.getUsuario().getNome() + " - Saldo: " + Contas.formatarSaldo(c1.getSaldo()));
        System.out.println("Nome usuário: " + c2.getUsuario().getNome() + " - Saldo: " + Contas.formatarSaldo(c2.getSaldo()));
        System.out.println("Nome usuário: " + c3.getUsuario().getNome() + " - Saldo: " + Contas.formatarSaldo(c3.getSaldo()));
    }
}
