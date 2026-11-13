package tema01fundamentos.sub01variaveis;

import java.util.Scanner;

public class QuocienteEResto {
    public static void main(String[] args) {

        // Leia dois inteiros e imprima o quociente (/) e o resto (%). Depois imprima n % 2 para o primeiro número e
        // observe o que o valor indica.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois números inteiros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // Imprime a divisão entre num1 e num2
        System.out.println("Quociente: " + num1 / num2);
        // Imprime o resto da divisão entre num1 e num2
        System.out.println("Resto: " + num1 % num2);
        // Imprime o resto da divisão entre num1 e 2
        System.out.println("N1 % 2: " + num1 % 2);
        // Imprime o resto da divisão entre num2 e 2
        System.out.println("N2 % 2: " + num2 % 2);

        scanner.close();
    }
}
