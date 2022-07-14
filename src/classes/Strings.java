package classes;

public class Strings {

    public static void main(String[] args) {

        String a = "a";
        String palavra = "palavra";
        String frase = "Essa é uma frase.";

        //comparando Strings
        boolean eIgual = a.equals(palavra);

        //vendo se a String contém alguma coisa
        boolean contem = palavra.contains("a");

        //vendo se palavra está vazia
        boolean estaVazio = palavra.isEmpty();

        //transformando a palvra pra tudo maiúsculo
        String palavraEmMaiusculo = palavra.toUpperCase();

        //transformando a palvra pra tudo minúsculo
        String palavraEmMinusculo = palavra.toLowerCase();

        //vendo a quantidade de caracteres
        int quantidadeLetras = palavra.length();

        //vendo se a palavra é igual ignorando maiusculas e minusculas
        boolean igual = palavra.equalsIgnoreCase("PALAVRA");

        //quebra a string de acordo com índice inicial e final, lembre-se que começa em 0
        String palavraQuebrada = palavra.substring(0,1);

        //vendo se a String começa com
        boolean comecaoCom = palavra.startsWith("pa");

        //vendo se a String termina com
        boolean terminaCom = palavra.endsWith("a");

        //removendo espaços em branco
        String semEspaco = palavra.trim();
    }

}
