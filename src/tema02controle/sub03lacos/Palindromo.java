package tema02controle.sub03lacos;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {

        // Leia uma palavra e diga se é palíndromo, comparando as letras das pontas.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra pra ver se é palíndromo: ");
        String palavra = scanner.nextLine();

        int inicio = 0;
        int fim = palavra.length() - 1;
        boolean isPalindromo = true;

        while (inicio < fim) {
            if (palavra.charAt(inicio) != palavra.charAt(fim)) {
                isPalindromo = false;
                break;
            }

            inicio++;
            fim--;
        }

        if(isPalindromo) {
            System.out.println("É palindromo");
        } else {
            System.out.println("Não é palindromo");
        }

        scanner.close();
    }
}
