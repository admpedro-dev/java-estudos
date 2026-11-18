package tema02controle.sub03lacos;

import java.util.Scanner;

public class ParesAteN {
    public static void main(String[] args) {

        // Leia N e imprima todos os números pares de 1 até N e quantos são.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número N e eu te direi quais números são pares de 1 até ele: ");
        int num = scanner.nextInt();
        int qtPares = 0;

        if (num <= 0) {
            System.out.println("Valor inválido. Tente novamente!");
        } else {

            System.out.print("São pares os seguintes números: ");

            for (int i = 1; i <= num; i++) {

                if (i % 2 == 0 && i == num) {
                    System.out.print("e " + i + "\n");
                    qtPares++;
                } else {
                    if (i % 2 == 0) {
                        System.out.print(i + ", ");
                        qtPares++;
                    }
                }
            }

            System.out.println("A quantidade de pares foi de: " + qtPares);
        }

        scanner.close();
    }
}
