package tema02controle.sub02switchcase;

import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {

        // Leia um número de 1 a 7 e imprima o dia (1 = domingo). Use default para valores inválidos

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        int dia = scanner.nextInt();

        switch(dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opcão inválida!");
                break;
        }

        scanner.close();
    }
}
