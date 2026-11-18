package tema02controle.sub03lacos;

import java.util.Scanner;

public class MenuRepetido {
    public static void main(String[] args) {

        // Com do-while, mostre um menu (1. Somar, 2. Subtrair, 0. Sair),
        // leia a opção e dois números e imprima o resultado. Repita até digitar 0.

        Scanner scanner = new Scanner(System.in);

        int escolha = 1;

       do {

           System.out.println("------------ Menu ------------");
           System.out.println("Escolha uma opção abaixo:");
           System.out.println("[1] Somar");
           System.out.println("[2] Subtrair");
           System.out.println("[0] Sair");
           escolha = scanner.nextInt();

           if (escolha == 0) {
               break;
           } else if (escolha > 2 || escolha < 0) {
               System.out.println("Opção inválida!");
           } else {
               System.out.print("\nDigite o primeiro número: ");
               int num1 = scanner.nextInt();

               System.out.print("Digite o segundo número: ");
               int num2 = scanner.nextInt();

               switch (escolha) {
                   case 1 -> System.out.println("Resultado: " + num1 + " + " + num2 + " = " + (num1 + num2) + "\n");
                   case 2 -> System.out.println("Resultado: " + num1 + " - " + num2 + " = " + (num1 - num2) + "\n");
               }
           }

       } while (escolha != 0);

        System.out.println("\nVocê saiu do programa!");

        scanner.close();
    }
}
