package tema02controle.sub02switchcase;

import java.util.Scanner;

public class ConceitoPorLetra {
    public static void main(String[] args) {

        // Leia A, B, C, D ou F e imprima o significado (A = excelente, F = reprovado). Aceite minúscula também.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a letra (A,B,C,D ou F): ");
        String letra = scanner.nextLine();

        switch (letra) {
            case "A", "a":
                System.out.println("Excelente");
                break;
            case "B", "b":
                System.out.println("Bom");
                break;
            case "C", "c":
                System.out.println("Regular");
                break;
            case "D", "d":
                System.out.println("Insuficiente");
                break;
            case "F", "f":
                System.out.println("Reprovado");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        scanner.close();

    }
}
