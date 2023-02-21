public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Viny";
        String segundoNome = "Pe";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "O Nome Completo é: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
