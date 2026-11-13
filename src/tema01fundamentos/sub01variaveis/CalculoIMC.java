package tema01fundamentos.sub01variaveis;

import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {

        // Leia peso (kg) e altura (m) e calcule peso / (altura * altura).
        // Imprima três boolean: abaixo de 18.5, entre 18.5 e 24.9, e acima de 24.9. Use operadores relacionais e &&.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso e sua altura respectivamente(kg e m): ");
        double peso = scanner.nextDouble();
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Abaixo de 18.5: " + (imc < 18.5));
        System.out.println("Entre 18.5 e 24.9: " + (imc >= 18.5 && imc <= 24.9));
        System.out.println("Acima de 24.9: " + (imc > 24.9));

        scanner.close();
    }
}
