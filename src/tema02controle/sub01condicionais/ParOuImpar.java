package tema02controle.sub01condicionais;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {

        // Leia um número inteiro e diga se é par ou ímpar

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é ímpar!");
        }

        scanner.close();
    }
}
