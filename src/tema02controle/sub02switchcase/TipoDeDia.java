package tema02controle.sub02switchcase;

import java.util.Scanner;

public class TipoDeDia {
    public static void main(String[] args) {

        // Leia o número do dia da semana e imprima útil ou fim de semana, usando o switch moderno
        // (case 1, 7 -> ...)

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número da semana (1 - 7): ");
        int dia = scanner.nextInt();

        switch (dia){
            case 1,2,3,4,5 -> System.out.println("Dia útil");
            case 6,7 -> System.out.println("Fim de semana");
            default -> System.out.println("Opção inválida! Tente novamente");
        }

        scanner.close();
    }
}
