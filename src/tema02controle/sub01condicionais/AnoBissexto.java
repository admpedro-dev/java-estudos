package tema02controle.sub01condicionais;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {

        // Leia um ano. É bissexto se for divisível por 4, exceto os divisíveis por 100,
        // a menos que também sejam divisíveis por 400.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("É bissexto!");
        } else {
            System.out.println("Não é bissexto!");
        }

        scanner.close();
    }
}
