package tema01fundamentos.sub01variaveis;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {

        // Leia 3 notas e imprima a média no formato Média: 7.5.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota 1, 2 e 3: ");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("Média: %.2f.", media);

        scanner.close();

    }
}
