package tema01fundamentos.sub02strings;

import java.util.Scanner;

public class MaiusculaMinuscula {
    public static void main(String[] args) {

        // Leia uma frase e imprima três versões: tudo maiúsculo, tudo minúsculo e sem espaços nas pontas.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        System.out.println(palavra.toUpperCase());
        System.out.println(palavra.toLowerCase());
        System.out.println(palavra.trim());

        scanner.close();

    }
}
