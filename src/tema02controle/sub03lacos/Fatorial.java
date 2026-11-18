package tema02controle.sub03lacos;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        // Leia N e calcule N! usando while.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número para revelar o seu fatorial: ");
        int num = scanner.nextInt();
        int numOriginal = num;
        long fatorial = 1;

        if (num <= 0) {
            System.out.println("Valor inválido. Tente novamente!");
        } else {
            while(num > 0) {

                if (num == 1) {
                    System.out.println(num + " = " + fatorial);
                } else {
                    System.out.print(num + " x ");
                    fatorial *= num;
                }

                num--;
            }
        }

        scanner.close();
    }
}
