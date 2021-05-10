package reschke.scheidt.renan.pedra_papel_tesoura.controlador;

import reschke.scheidt.renan.pedra_papel_tesoura.model.*;

import java.util.Random;
import java.util.Scanner;

public class Sistema {
    private Jogador player1, player2;
    private Scanner sc;
    public Sistema(){
        sc = new Scanner(System.in);
        inicializarJogadores();
    }
    public void run(){
        boolean continuar = true;
        do{
            System.out.println(player1.getNome() + " vs " + player2.getNome());
            player1.setJogada(escolheJogada());
            player2.setJogada(sortearJogada());
            System.out.println("Jogada Player 1: "+player1.getJogada());
            System.out.println("Jogada Player 2: "+player2.getJogada());
            System.out.println("Resultado: "+player1.getJogada().verificarResultado(player2.getJogada()));
        }while(continuar);
    }

    private Jogada escolheJogada(){
        System.out.println("Informe sua jogada: \n1 - Pedra\n2 - Papel\n3 - Tesoura");
        int escolha = sc.nextInt();
        Jogada [] jogadas = new Jogada[]{new Pedra(), new Papel(), new Tesoura()};
        return jogadas[escolha-1];
    }

    private Jogada sortearJogada(){
        Jogada [] jogadas = new Jogada[]{new Pedra(), new Papel(), new Tesoura()};
        return jogadas[new Random().nextInt(jogadas.length)];
    }

    private void inicializarJogadores(){
        System.out.print("Informe um nome para o jogador 1: ");
        String nome = sc.next();
        this.player1 = new Jogador(nome, true);
        this.player2 = new Jogador("NPC");
    }
}
