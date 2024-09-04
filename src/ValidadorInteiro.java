public class ValidadorInteiro implements ValidadorTipo {  //usa a interface
    @Override
    public boolean valida(String valor) {  //Sobreescrita
        for (int i = 0; i < valor.length(); i++) {
            if (!Character.isDigit(valor.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
