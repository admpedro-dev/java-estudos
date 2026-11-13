package tema01fundamentos.sub02strings;

import java.util.Scanner;

public class PrimeiraMaiuscula {
    public static void main(String[] args) {

        // Leia uma palavra em qualquer formato e imprima com a primeira letra maiúscula e o resto minúscula.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        System.out.println(palavra.substring(0, 1).toUpperCase() + palavra.substring(1).toLowerCase());

        scanner.close();
    }
}
