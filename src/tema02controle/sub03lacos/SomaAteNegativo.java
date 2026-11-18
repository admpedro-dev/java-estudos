package tema02controle.sub03lacos;

import java.util.Scanner;

public class SomaAteNegativo {
    public static void main(String[] args) {

        // Leia números em loop e some todos. Pare com break quando o usuário digitar um negativo.
        // Imprima a soma e quantos números foram lidos. Com continue, ignore o 0 (não conta na quantidade).

        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int escolha = 1;
        int qtNumeros = 0;

        while (true) {
            System.out.print("Digite um número para a soma (negativo se quiser parar): ");
            escolha = scanner.nextInt();

            if (escolha == 0) {
                continue;
            } else if (escolha < 0) {
                break;
            }

            soma += escolha;
            qtNumeros++;
        }

        System.out.println("A soma total foi de: " + soma);
        System.out.println("O total de números lidos foi de: " + qtNumeros);

        scanner.close();
    }
}
