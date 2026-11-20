package tema02controle.sub03lacos;

import java.util.Scanner;

public class FormataNome {
    public static void main(String[] args) {

        // Leia um nome completo e deixe cada palavra com a inicial maiúscula e o resto minúsculo.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome completo para a formatação: ");
        String nome = scanner.nextLine().toLowerCase();

        for (int i = 0; i < nome.length(); i++) {
            char letraAtual = nome.charAt(i);

            if (i == 0 || nome.charAt(i - 1) == ' ') {
                System.out.print(Character.toUpperCase(letraAtual));
            } else {
                System.out.print(letraAtual);
            }
        }

        scanner.close();
    }
}
