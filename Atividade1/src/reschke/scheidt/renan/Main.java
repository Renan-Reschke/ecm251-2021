//19.02009-0 Renan Scheidt Reschke
package reschke.scheidt.renan;

public class Main {

    public static void main(String[] args) {
	Usuarios u1 = new Usuarios("u1","awffa", "wfafawf@awfgw");
	Usuarios u2 = new Usuarios("u2", "awfafawf", "awaraw@hjbaw");
	Contas c1 = new Contas(u1);
	Contas c2 = new Contas(u2);
	c2.verificarIdConta();
	c1.verificarIdConta();

    }
}
