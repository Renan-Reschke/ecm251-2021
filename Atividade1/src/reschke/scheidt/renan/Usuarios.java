//19.02009-0 Renan Scheidt Reschke
package reschke.scheidt.renan;

public class Usuarios {
    //Atributos
    private String nome;
    private String senha;
    private String email;
    private static int qntUsuarios = 0;

    //Construtor
    public Usuarios(String nome, String senha, String email){
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.qntUsuarios += 1;
    }

    //Getters
    public String getNome(){                                            //Retorna o nome do usuário
        return this.nome;
    }

    public String getEmail() {                                          //Retorna o email do Usuário
        return email;
    }

    //toString - Retorna as informações do objeto como string
    @Override
    public String toString() {
        return "Usuarios{" +
                "nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
