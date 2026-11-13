package tema02controle.sub01condicionais;

import java.util.Scanner;

public class ClassificaNota {
    public static void main(String[] args) {

        // Leia uma nota. 7 ou mais: Aprovado. De 4 a 6.9: Recuperação. Abaixo de 4: Reprovado.
        // Fora do intervalo de 0 a 10, imprima Nota inválida.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua nota: ");
        double nota = scanner.nextDouble();

        if (nota >= 7 && nota <= 10) {
            System.out.println("Aprovado!");
        } else if (nota >= 4 && nota <= 6.9) {
            System.out.println("Recuperação!");
        } else if (nota < 4 && nota >= 0) {
            System.out.println("Reprovado!");
        } else {
            System.out.println("Nota inválida!");
        }

        scanner.close();
    }
}
