package tema02controle.sub03lacos;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {

        // Leia um número e diga se é primo.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para o programa checar se é primo ou não: ");
        int num = scanner.nextInt();

        int divisores = 3;
        boolean isPrimo = true;

        // Numeros menores ou iguais a 1 -> Não são primos
        // Numeros 2 e 3 -> Primos
        // Numeros maiores que 2 e pares -> Não são primos
        if (num <= 1) {
            isPrimo = false;
        } else if (num == 2 || num == 3) {
            isPrimo = true;
        } else if (num % 2 == 0) {
            isPrimo = false;
        } else {

            // O número que não possui divisores menores que sua raíz quadrada, não possui divisores.
            while (divisores <= Math.sqrt(num)) {

                // Se achar um divisor, finaliza e seta [isPrimo] como false.
                if (num % divisores == 0) {
                    isPrimo = false;
                    break;
                }

                divisores += 2;
            }
        }

        if(isPrimo) {
            System.out.println("É primo!");
        } else {
            System.out.println("Não é primo!");
        }

        scanner.close();
    }
}
