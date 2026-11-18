package tema02controle.sub03lacos;

import java.util.Scanner;

public class SomaAteN {
    public static void main(String[] args) {

        // Leia N e imprima a soma de 1 até N.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para a soma de 1 até N: ");
        int num = scanner.nextInt();
        int soma = 0;

        if (num <= 0) {
            System.out.println("Valor inválido, tente novamente.");
        } else {
            for (int i = 1; i <= num; i++) {
                if (i != num) {
                    System.out.print(i + " + ");
                    soma += i;
                } else {
                    System.out.print(i);
                    soma += i;
                }
            }
            System.out.print(" = " + soma);
        }

        scanner.close();
    }
}
