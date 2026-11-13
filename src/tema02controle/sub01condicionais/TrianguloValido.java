package tema02controle.sub01condicionais;

import java.util.Scanner;

public class TrianguloValido {
    public static void main(String[] args) {

        // Leia três lados. Formam triângulo se cada lado for menor que a soma dos outros dois.
        // Se formarem, classifique como equilátero, isósceles ou escaleno.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 3 lados: ");
        double lado1 = scanner.nextDouble();
        double lado2 = scanner.nextDouble();
        double lado3 = scanner.nextDouble();

        if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && (lado3 < (lado1 + lado2))) {

            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("É um triangulo equilátero!");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("É um triangulo isosceles!");
            } else {
                System.out.println("É um triangulo escaleno!");
            }

        } else {
            System.out.println("Não é triangulo!");
        }

        scanner.close();

    }
}
