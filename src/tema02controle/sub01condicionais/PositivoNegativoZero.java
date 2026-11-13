package tema02controle.sub01condicionais;

import java.util.Scanner;

public class PositivoNegativoZero {
    public static void main(String[] args) {

        // Leia um número e diga se é positivo, negativo ou zero.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        if (num == 0) {
            System.out.println("O número é zero!");
        } else if (num > 0) {
            System.out.println("O número é positivo!");
        } else {
            System.out.println("O número é negativo!");
        }

        scanner.close();
    }
}
