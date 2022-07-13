package wrappers.classes;

public class Boleano {

    public static void main(String[] args) {

        //declarando uma variável do tipo boleano e abaixo o objeto wrapper correspondente
        boolean b = true;
        Boolean bo = true;

        //usando o operador &&(e) só dá true se ambos forem true
        if(b && bo) System.out.println("Ambos são verdadeiros.");
        //usando o operador ||(ou) dá true se um deles for true
        if(b || bo) System.out.println("Um deles é verdadeiro.");

        //transformando o b em falso
        boolean falso = !b;

        //comparando dois boleanos
        boolean eIgual = bo.equals(b);

        //converte para String
        String inteiro = bo.toString();

    }




}
