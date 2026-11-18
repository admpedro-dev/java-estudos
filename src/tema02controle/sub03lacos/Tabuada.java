package tema02controle.sub03lacos;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        // Leia um número e imprima a tabuada de 1 a 10.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para a tabuada: ");
        double num = scanner.nextDouble();

        for (double i = 1; i <= 10; i++) {
            System.out.printf("%.2f x %.0f = %.2f\n", num, i, (num * i));
        }

        scanner.close();
    }
}
