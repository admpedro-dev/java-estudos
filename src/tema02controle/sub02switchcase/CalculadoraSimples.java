package tema02controle.sub02switchcase;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {

        // Leia dois números e um operador (+, -, *, /) e imprima o resultado. Trate a divisão por zero.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite a operação desejada (+, -, *, /): ");
        String operacao = scanner.next();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        switch (operacao) {
            case "+" -> System.out.printf("O resultado da operação é: %.2f", (num1 + num2));
            case "-" -> System.out.printf("O resultado da operação é: %.2f", (num1 - num2));
            case "*" -> System.out.printf("O resultado da operação é: %.2f", (num1 * num2));
            case "/" -> {
                if (num2 != 0) {
                    System.out.printf("O resultado da operação é: %.2f", (num1 / num2));
                } else {
                    System.out.println("É impossivel dividir por zero!");
                }
            }
            default -> System.out.println("Operação inválida! Tente novamente");
        }

        scanner.close();
    }
}
