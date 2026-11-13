package tema02controle.sub01condicionais;

import java.util.Scanner;

public class RaizesEquacao {
    public static void main(String[] args) {

        // Leia A, B e C e calcule o delta (b*b - 4*a*c). Negativo: Sem raízes reais. Zero: uma raiz.
        // Positivo: duas raízes.
        // Imprima as raízes quando existirem. Teste (1, -3, 2): raízes 2 e 1

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite A, B e C da equação: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double delta = (Math.pow(b, 2)) - 4 * a * c;

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais!");
        } else if (delta == 0) {
            double x1 = ((b * -1) + Math.sqrt(delta)) / (2 * a);
            System.out.println("A equação possui duas raízes reais iguais: " + x1);
        } else if (delta > 0) {
            double x1 = ((b * -1) + Math.sqrt(delta)) / (2 * a);
            double x2 = ((b * -1) - Math.sqrt(delta)) / (2 * a);
            System.out.printf("A equação possui duas raízes reais distintas: %.2f e %.2f", x1, x2);
        }

        scanner.close();
    }
}
