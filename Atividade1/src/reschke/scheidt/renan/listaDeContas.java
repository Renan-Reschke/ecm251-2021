/**
 *
 *  @author 19.02009-0 Renan Scheidt Reschke <renanreschke@hotmail.com>
 *
 */

package reschke.scheidt.renan;

public class listaDeContas {

    //Atributos
    private static int qntContas = 0;                //Contabiliza a quantidade de contas existentes
    private static Conta[] contas = new Conta[0];    //Responsável por armazenar as contas

    //Getter
    public static Conta getConta(int idConta){
        return contas[idConta - 1];
    }

    //Métodos de classe
    public static void addConta(Conta conta){       //Adiciona uma nova conta a lista de contas existentes
        qntContas += 1;
        Conta[] newContas = new Conta[qntContas];   //Cria um array de contas vazio
        for (int i = 0; i < qntContas - 1; i++) {   //Copia as contas do array inicial
            newContas[i] = contas[i];
        }
        newContas[qntContas - 1] = conta;             //Adiciona a conta ao array
        contas = newContas.clone();                 //Substitui o array original, com a conta add
        }   //Possivel criacao futura de um metodo que remova a conta, nao necessario no momento
}
