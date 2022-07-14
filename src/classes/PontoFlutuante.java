package classes;

public class PontoFlutuante {

    public static void main(String[] args) {

        //declarando uma variável do tipo float e abaixo o objeto wrapper correspondente
        //observe que aqui precisamos colocar o "f" após o número para guardar em um float
        float f = 1.0f;
        Float fl = 1.0f;

        //declarando uma variável do tipo double e abaixo o objeto wrapper correspondente
        double d = 2.0;
        Double db = 2.0;

        //operacaoes
        double soma = f + d;
        double subtracao = d - f;
        double multiplicacao = d * f;
        double divisao = d / f;

        //observe que só usei os tipos primitivos, mas poderia usar os objetos wrappers
        //graças ao unboxing
        double soma2 = fl + db;

        //principais métodos dos wrappers

        //comparando dois números
        boolean eIgual = db.equals(3);

        //convertendo para String
        String pontoFlutuante = db.toString();

        //convertendo uma String para número
        Double numero = Double.parseDouble("10");

        //vendo se é um número
        boolean eNumero = db.isNaN();

        //vendo se é um número infinito
        boolean eInfinito = db.isInfinite();

        //convertendo em um número inteiro(parte após a "," será perdida
        Integer integer = db.intValue();

    }
}
