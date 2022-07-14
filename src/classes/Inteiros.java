package classes;

public class Inteiros {

    public static void main(String[] args) {

        //declarando uma variável do tipo byte e abaixo o objeto wrapper correspondente
        byte b = 1;
        Byte by = 1;

        //declarando uma variável do tipo short e abaixo o objeto wrapper correspondente
        short s = 2;
        Short sh = 2;

        //declarando uma variável do tipo int e abaixo o objeto wrapper correspondente
        int i = 3;
        Integer integer = 3;

        //declarando uma variável do tipo long e abaixo o objeto wrapper correspondente
        //se não colocarmos o "l" após o número ele dará um erro, porque ???
        long l = 4;
        Long lg = 4l;

        //operacaoes
        int soma = b + s;
        int subtracao = i - b;
        int multiplicacao = i * s;
        int divisao = i / b;
        int restoDivisao = i % b;

        //observe que não usei o tipo long nas operacoes, para fazer isso, preciso de uma variavél tipo long
        //para armazenar o resultado, visto que pode não "caber" em um int, e o compilador não aceita. Nesse
        //caso a dica é sempre "guardar" o resultado no maior tipo envolvido.
        long resultado = l * i;

        //autoboxing: quando um tipo primitivo é atribuido em um objeto wrapper
        int n = 10;
        Integer integer1 = n;

        //unboxing: quando um objeto wrapper é atribuído a um tipo primitivo
        Long l1 = 20l;
        long l2 = l1;

        //principais métodos dos wrappers

        //comparando dois números
        boolean eIgual = integer.equals(3);

        //converte para String
        String inteiro = integer.toString();

        //convertendo uma String para número
        Integer numero = Integer.parseInt(inteiro);


    }
}
