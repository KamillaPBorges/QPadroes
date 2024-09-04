public class Validador {
    public boolean valida(ValidadorFactory.Tipo tipo, String valor) {
        ValidadorTipo validador = ValidadorFactory.obterValidador(tipo);
        return validador.valida(valor);
    }

    public static void main(String[] args) {
        Validador validador = new Validador();  // Corrigido para "Validador" com um "r"
        
        System.out.println(validador.valida(ValidadorFactory.Tipo.EMAIL, "teste@exemplo.com"));  // true
        System.out.println(validador.valida(ValidadorFactory.Tipo.INTEIRO, "12345"));  // true
        System.out.println(validador.valida(ValidadorFactory.Tipo.MATRICULA, "123456"));  // false
    }
}
