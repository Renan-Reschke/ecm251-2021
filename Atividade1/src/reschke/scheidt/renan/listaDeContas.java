/**
 *
 *  @author 19.02009-0 Renan Scheidt Reschke <renanreschke@hotmail.com>
 *  @author 19.01370-0 Felipe Freitas Villani <felipevillani.2000@hotmail.com>
 *
 */

package reschke.scheidt.renan;

public class listaDeContas {

    //Atributos
    private static int qntContas = 0;                //Contabiliza a quantidade de contas existentes
    public static Conta[] contas = new Conta[0];    //Responsável por armazenar as contas

    //Métodos de classe
    public static void addConta(Conta conta){
        qntContas += 1;
        Conta[] newContas = new Conta[qntContas];   //Cria um array de contas vazio
        for (int i = 0; i < qntContas - 1; i++) {   //Copia as contas do array inicial
            newContas[i] = contas[i];
        }
        newContas[qntContas - 1] = conta;             //Adiciona a conta ao array
        contas = newContas.clone();                 //Substitui o array original, com a conta add
        }
}
