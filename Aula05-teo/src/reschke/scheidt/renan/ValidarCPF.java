package reschke.scheidt.renan;

public class ValidarCPF {
    private static String[] invalidosConhecidos = {
            "00000000000", "11111111111", "22222222222",
            "33333333333", "44444444444", "55555555555",
            "66666666666", "77777777777", "88888888888",
            "99999999999"
    };
    private static int TAMANHO_CPF = 11;
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
        return true;
    }
}
