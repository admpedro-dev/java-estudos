package tema02controle.sub01condicionais;

import java.util.Scanner;

public class MaiorDeTres {
    public static void main(String[] args) {

        // Leia três números e imprima o maior.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 3 números: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("São todos iguais");
        } else if (num1 > num2 && num1 > num3) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O maior número é: " + num2);
        } else if (num3 > num2 && num3 > num1) {
            System.out.println("O maior número é: " + num3);
        } else {
            if (num1 == num2) {
                System.out.println("O primeiro e o segundo empataram! E o número é: " + num1);
            } else if (num1 == num3) {
                System.out.println("O primeiro e o terceiro empataram! E o número é: " + num1);
            } else {
                System.out.println("O segundo e o terceiro empataram! E o número é: " + num2);
            }
        }

        scanner.close();
    }
}
