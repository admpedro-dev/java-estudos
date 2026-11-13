package tema02controle.sub02switchcase;

import java.util.Scanner;

public class DiasDoMes {
    public static void main(String[] args) {

        // Leia o número do mês e imprima quantos dias ele tem. Agrupe os case com o mesmo resultado e
        // trate fevereiro como 28.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do mês: ");
        int mes = scanner.nextInt();

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Ele tem 31 dias!");
                break;
            case 4, 6, 9, 11:
                System.out.println("Ele tem 30 dias!");
                break;
            case 2:
                System.out.println("Ele tem 28 dias!");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        scanner.close();
    }
}
