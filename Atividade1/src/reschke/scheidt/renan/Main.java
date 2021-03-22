//19.02009-0 Renan Scheidt Reschke
package reschke.scheidt.renan;

public class Main {

    public static void main(String[] args) {
        //Criação dos usuários - OK
        Usuario u1 = new Usuario("Allmight","12345678", "Allmight@gmail.com");
        Usuario u2 = new Usuario("One For All", "12345678", "OneForAll@gmail.com");
        Usuario u3 = new Usuario("Bakugo", "12345678", "Bakugo@gmail.com");

        //Criação das Contas - OK
        Conta c1 = new Conta(u1,1000.0);
        listaDeContas.addConta(c1);
        Conta c2 = new Conta(u2,250.0);
        listaDeContas.addConta(c2);
        Conta c3 = new Conta(u3,3000.0);
        listaDeContas.addConta(c3);


        //Verificação do estado INICIAL - OK
        System.out.println("Estado inicial:");
        System.out.println("Nome usuário: " + c1.getUsuario().getNome() + " - Saldo: " + Conta.formatarSaldo(c1.getSaldo()));
        System.out.println("Nome usuário: " + c2.getUsuario().getNome() + " - Saldo: " + Conta.formatarSaldo(c2.getSaldo()));
        System.out.println("Nome usuário: " + c3.getUsuario().getNome() + " - Saldo: " + Conta.formatarSaldo(c3.getSaldo()));

        //Operações de teste
        String QRCode1 = Transacoes.qrCode(c1, 250);
        c2.pagar(QRCode1);
        c3.pagar(QRCode1);
        c2.pagar(QRCode1);
        String QRCode2 = Transacoes.qrCode(c2, 1000);
        c3.pagar(QRCode2);

        //Verificação do estado FINAL
        System.out.println("Estado final:");
        System.out.println("Nome usuário: " + c1.getUsuario().getNome() + " - Saldo: " + Conta.formatarSaldo(c1.getSaldo()));
        System.out.println("Nome usuário: " + c2.getUsuario().getNome() + " - Saldo: " + Conta.formatarSaldo(c2.getSaldo()));
        System.out.println("Nome usuário: " + c3.getUsuario().getNome() + " - Saldo: " + Conta.formatarSaldo(c3.getSaldo()));
    }
}
