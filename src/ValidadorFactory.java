public class ValidadorFactory {  //Classe que irá retornar o validador correto com base no tipo
    public enum Tipo { EMAIL, INTEIRO, MATRICULA }
    
    
        public static ValidadorTipo obterValidador(Tipo tipo) {  //é estatico para n precisar instancia obj ValidadorFactory
            switch (tipo) {
                case INTEIRO:
                    return new ValidadorInteiro();
                case MATRICULA:
                    return new ValidadorMatricula();
                case EMAIL:
                    return new ValidadorEmail();
                default:
                    throw new IllegalArgumentException("Tipo de validador desconhecido");
            }
        }
    }
    









