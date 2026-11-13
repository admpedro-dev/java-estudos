package tema02controle.sub02switchcase;

import java.util.Scanner;

public class SwitchComString {
    public static void main(String[] args) {

        // Leia pedra, papel ou tesoura e imprima o que ele vence.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha pedra, papel ou tesoura: ");
        String escolha = scanner.nextLine().toLowerCase();

        switch (escolha) {
            case "pedra":
                System.out.println("Pedra vence tesoura");
                break;
            case "papel":
                System.out.println("Papel vence pedra");
                break;
            case "tesoura":
                System.out.println("Tesoura vence papel");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        scanner.close();

    }
}
