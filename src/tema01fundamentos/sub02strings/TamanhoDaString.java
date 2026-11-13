package tema01fundamentos.sub02strings;

import java.util.Scanner;

public class TamanhoDaString {
    public static void main(String[] args) {

        // Leia uma palavra e imprima o tamanho, a primeira letra e a última letra.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        System.out.println("O tamanho da palavra é de: " + palavra.length() + " caracteres.");
        System.out.println("A primeira letra da palavra é: " + palavra.charAt(0));
        System.out.println("A ultima letra da palavra é: " + palavra.charAt(palavra.length() - 1));

        scanner.close();
    }
}
