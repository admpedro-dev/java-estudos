package tema01fundamentos.sub01variaveis;

public class DivisaoInteira {
    public static void main(String[] args) {

        // Divida 7 por 2 de três formas e imprima cada resultado:
        // int / int, double / int e (double) 7 / 2

        // Dois inteiros: O Java descarta a parte fracionaria de forma automatica
        // logo 7 dividido por 2 = 3.
        System.out.println(7 / 2);

        // Um inteiro e um double: O Java transfroma temporariamente o inteiro em double e calcula de forma precisa
        // logo 7.0/2.0 = 3.5.
        System.out.println(7 / 2.0);

        // Um inteiro e um double formado por casting: Por ter sido transformado em double ele segue a mesma regra da
        // anterior.
        System.out.println(7 / (double) 2);
    }
}
