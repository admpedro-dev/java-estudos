package tema02controle.sub03lacos;

import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {

        // Leia um número N e imprima de N até 0, um por linha.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para a contagem até 0: ");
        int num = scanner.nextInt();

        if (num <= 0) {
            System.out.println("Escolha inválida. Tente novamente");
        } else {
            for (int i = 0; num >= i; num --) {
                System.out.println(num);
            }
        }

        scanner.close();
    }
}
