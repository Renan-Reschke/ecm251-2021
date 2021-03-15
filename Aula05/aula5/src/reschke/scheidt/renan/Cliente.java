package reschke.scheidt.renan;

public class Cliente {
    //Atributos
    String nome, sobrenome;
    String cpf;

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }

}
