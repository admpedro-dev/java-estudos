package tema02controle.sub03lacos;

import java.util.Scanner;

public class ContaVogais {
    public static void main(String[] args) {

        // Leia uma frase e conte as vogais, maiúsculas e minúsculas.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        int qtVogais = 0;
        String vogais = "aeiou";

        for (int i = 0; i < frase.length(); i++) {
            char letraAtualMinuscula = Character.toLowerCase(frase.charAt(i));

            // "teste".indexOf('t') -> Procura o char ['t'] na String ["teste"].
            // Se for encontrado, retorna o índice dele na String, caso contrário, retorna -1, pois o índice n existe.
            if (vogais.indexOf(letraAtualMinuscula) != -1) {
                qtVogais++;
            }
        }

        System.out.println("Sua frase tem " + qtVogais + " vogal(is)");

        scanner.close();
    }
}
