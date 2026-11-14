package tema02controle.sub02switchcase;

import java.util.Scanner;

public class VogalOuConsoante {
    public static void main(String[] args) {

        // Leia uma letra e diga se é vogal ou consoante, com case agrupados.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        String letra = scanner.nextLine().toLowerCase();

        switch (letra) {
            case "a","e","i","o","u":
                System.out.println("É vogal");
                break;
            default:
                System.out.println("É consoante");
                break;
        }

        scanner.close();
    }
}
