package tema02controle.sub03lacos;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        // Leia N e imprima os N primeiros termos da sequência de Fibonacci.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero N para a sequencia de Fibonacci: ");
        int num = scanner.nextInt();

        // os dois primeiros numeros sao fixos:
        // 1 e 2

        int anterior = 0;
        int atual = 1;

        for (int i = 0; i < num; i++) {
            if (i == 0) {
                System.out.print(anterior + " ");
            } else if (i == 1) {
                System.out.print(atual + " ");
            } else {
                int proximo = anterior + atual;
                System.out.print(proximo + " ");

                anterior = atual;
                atual = proximo;
            }
        }
        scanner.close();
    }
}
