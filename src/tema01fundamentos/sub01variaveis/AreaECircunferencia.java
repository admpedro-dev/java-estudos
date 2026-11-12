package tema01fundamentos.sub01variaveis;

import java.util.Scanner;
import java.lang.Math;

public class AreaECircunferencia {
    public static void main(String[] args) {

        // Leia o raio e imprima a área e o perímetro. Use Math.PI.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio do circulo: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        double perimetro = 2 * Math.PI * raio;

        System.out.printf("Área = %.2f\n", area);
        System.out.printf("Perímetro = %.2f\n", perimetro);

        scanner.close();
    }
}
