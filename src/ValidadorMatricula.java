public class ValidadorMatricula implements ValidadorTipo {
    @Override
    public boolean valida (String valor){
        ValidadorInteiro validadorInteiro = new ValidadorInteiro();
        if (!validadorInteiro.valida(valor)){
            return false;
        }else{
            int sum = 0;
            for(int i=0;i<valor.length()-1;i++){
                sum += Character.getNumericValue(valor.charAt(i));
            }
            int verificador = sum%10;
            if (verificador == Character.getNumericValue(valor.charAt(valor.length()-1))){
                return true;
            }
        }
        return false;



    }

    
}
