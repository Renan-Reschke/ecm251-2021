package reschke.scheidt.renan;

public class listaDeContas {
    public static int qntContas = 0;
    //Responsável por armazenar as contas
    public static Conta[] contas = new Conta[0];

    public static void addConta(Conta conta){
        Conta[] newContas = new Conta[qntContas];   //Cria um array de contas vazio
        for (int i = 0; i < qntContas - 1; i++) {   //Copia as contas do array inicial
            newContas[i] = contas[i];
        }
        newContas[qntContas-1] = conta;             //Adiciona a conta ao array
        contas = newContas.clone();                 //Substitui o array original, com a conta add
        }
}
