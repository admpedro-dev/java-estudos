package tema02controle.sub03lacos;

import java.util.Scanner;

public class InverteString {
    public static void main(String[] args) {

        // Leia uma palavra e imprima invertida, com for de trás pra frente (sem StringBuilder.reverse()).

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a palavra pra ser invertida: ");
        String palavra = scanner.nextLine();

        for (int i = palavra.length() -1; i >= 0; i--) {
            System.out.print(palavra.charAt(i));
        }

        scanner.close();
    }
}
