package tema01fundamentos.sub01variaveis;

import java.util.Scanner;

public class CelsiusParaFahrenheit {
    public static void main(String[] args) {

        // Leia a temperatura em Celsius e imprima em Fahrenheit..
        // Fórmula: F = C * 9 / 5 + 32.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double tempCelsius = scanner.nextDouble();
        double tempFahrenheit = (tempCelsius * 9.0 / 5.0) + 32;

        System.out.printf("A temperatura em fahrenheit é: %.2f", tempFahrenheit);

        scanner.close();
    }
}
