package tema02controle.sub03lacos;

import java.util.Scanner;

public class SomaDigitos {
    public static void main(String[] args) {

        // Leia um inteiro positivo e some seus dígitos usando while com % e /

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro e positivo para que seus digitos sejam somados: ");
        int num = scanner.nextInt();
        int soma = 0;

        // trabalhando com inteiros
        // [/] remover o ultimo digito -> ex: 123 / 10 = 12
        // [%] dá o ultimo digito -> ex: 123 % 10 = 3

        if (num < 0) {
            System.out.println("Opção inválida. Tente novamente!");
        } else {
            while (num > 0) {
                soma += num % 10;
                num /= 10;
            }

            System.out.println("A soma dos digitos do seu número é: " + soma);
        }

        scanner.close();
    }
}
