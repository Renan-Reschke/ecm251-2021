package reschke.scheidt.renan;

import java.util.Scanner;

public class Sistema {
    private boolean executarSistema;
    private Scanner scanner;

    public void executar(){
        int opcao;
        while(executarSistema) {
            exibirMenu();
            opcao = scanner.nextInt();
            avaliarOpcao(opcao);
        }
    }

    private void avaliarOpcao(int opcao) {
        switch(opcao){
            case 0:
                System.out.println("Obrigado por escolher o MauaBank");
                executarSistema = false;
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                System.out.println("Funcionalidade nao implementada");
        }
    }

    public Sistema() {
        this.scanner = new Scanner(System.in); //Deixa ler entrada do sistema
        this.executarSistema = true;
    }

    private void exibirMenu() {
        System.out.println("Bem Vindo ao MauaBank");
        System.out.println("1 - Visualizar Saldo");
        System.out.println("2 - Sacar Dinheiro");
        System.out.println("3 - Depositar Dinheiro");
        System.out.println("4 - Transferir Dinheiro");
        System.out.println("5 - Pagar Conta (Título)");
        System.out.println("0 - Encerrar");
    }
}
