package tema01fundamentos.sub02strings;

import java.util.Scanner;

public class ContaOcorrencias {
    public static void main(String[] args) {

        // Leia uma frase e uma letra e diga quantas vezes a letra aparece, ignorando maiúsculas e minúsculas.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        System.out.print("Qual letra você quer contar?: ");
        String letra = scanner.nextLine().toUpperCase();

        System.out.print("A quantidade de vezes que a letra " + letra + " aparece é de: ");
        System.out.print(frase.toUpperCase().length() - frase.toUpperCase().replace(letra, "").length());

        scanner.close();

    }
}
