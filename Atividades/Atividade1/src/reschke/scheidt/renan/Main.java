/**
 *
 *  @author 19.02009-0 Renan Scheidt Reschke <renanreschke@hotmail.com>
 *
 */

package reschke.scheidt.renan;

public class Main {

    public static void main(String[] args) {
        //Criação dos usuários - OK
        Usuario u1 = new Usuario("Allmight","12345678", "Allmight@gmail.com");      //Cria usuário 1
        Usuario u2 = new Usuario("One For All", "12345678", "OneForAll@gmail.com"); //Cria usuário 2
        Usuario u3 = new Usuario("Bakugo", "12345678", "Bakugo@gmail.com");         //Cria usuário 3

        //Criação das Contas - OK
        Conta c1 = new Conta(u1,1000.0);    //Cria uma conta para o usuário 1
        listaDeContas.addConta(c1);                  //Adiciona a conta 1 à lista de contas
        Conta c2 = new Conta(u2,250.0);     //Cria uma conta para o usuário 2
        listaDeContas.addConta(c2);                  //Adiciona a conta 2 à lista de contas
        Conta c3 = new Conta(u3,3000.0);    //Cria uma conta para o usuário 3
        listaDeContas.addConta(c3);                  //Adiciona a conta 3 à lista de contas


        //Verificação do estado INICIAL - OK
        System.out.println("Estado inicial:");
        System.out.println("Nome usuário: " + c1.getUsuario().getNome() + " - Saldo: " + Conta.formatarSaldo(c1.getSaldo()));
        System.out.println("Nome usuário: " + c2.getUsuario().getNome() + " - Saldo: " + Conta.formatarSaldo(c2.getSaldo()));
        System.out.println("Nome usuário: " + c3.getUsuario().getNome() + " - Saldo: " + Conta.formatarSaldo(c3.getSaldo()));

        //Operações de teste
        String qrCode1 = Transacoes.qrCode(c1, 250);
        c2.pagar(qrCode1);
        c3.pagar(qrCode1);
        c2.pagar(qrCode1);
        String qrCode2 = Transacoes.qrCode(c2, 1000);
        c3.pagar(qrCode2);

        //Verificação do estado FINAL - OK
        System.out.println("Estado final:");
        System.out.println("Nome usuário: " + c1.getUsuario().getNome() + " - Saldo: " + Conta.formatarSaldo(c1.getSaldo()));
        System.out.println("Nome usuário: " + c2.getUsuario().getNome() + " - Saldo: " + Conta.formatarSaldo(c2.getSaldo()));
        System.out.println("Nome usuário: " + c3.getUsuario().getNome() + " - Saldo: " + Conta.formatarSaldo(c3.getSaldo()));
    }
}
