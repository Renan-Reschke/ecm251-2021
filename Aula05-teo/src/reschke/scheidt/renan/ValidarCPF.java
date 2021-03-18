package reschke.scheidt.renan;

public class ValidarCPF {
    private static final String[] invalidosConhecidos = {
            "00000000000", "11111111111", "22222222222",
            "33333333333", "44444444444", "55555555555",
            "66666666666", "77777777777", "88888888888",
            "99999999999"
    };

    private static final int[] multiplicadoresPrimeiroDigito = {
            10,9,8,7,6,5,4,3,2
    };
    private static final int[] multiplicadoresSegundoDigito = {
            11,10,9,8,7,6,5,4,3,2
    };

    private static final int TAMANHO_CPF = 11;

    public static boolean validarCpf(String cpf){
        cpf = cpf.replace(".", "");
        cpf = cpf.replace("-", "");
        //Valida o tamanho do cpf
        if(cpf.length() != TAMANHO_CPF)
            return false;

        //Verifica se o CPF está dentro dos inválidos conhecidos
        for(String cpfInvalido : invalidosConhecidos){
            if(cpfInvalido.equals(cpf))
                return false;
        }

        //Validação do primeiro e do segundo digito
        if (validarDigito(multiplicadoresPrimeiroDigito,cpf) && validarDigito(multiplicadoresSegundoDigito, cpf))
            return true;

        return true;
    }
    private static boolean validarDigito(int[] mulplicadores, String cpf){
        int somatoria = 0;
        for(int i = 0; i < mulplicadores.length; i++){
            somatoria += mulplicadores[i] * Integer.parseInt(""+cpf.charAt(i));
        }
        return (""+((somatoria*10)%11)%10).equals(""+cpf.charAt(mulplicadores.length));
    }
}
