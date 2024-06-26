public class MinhaClasse3 {

public static void main(String[] args) {
    String primeiroNome = "Gabriel";
    String segundoNome = "Kloppel";

    String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
    System.out.println(nomeCompleto);
    
}   

public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do método é " + primeiroNome.concat(" ").concat(segundoNome);
}
    
}
