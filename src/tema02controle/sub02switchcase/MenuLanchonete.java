package tema02controle.sub02switchcase;

import java.util.Scanner;

public class MenuLanchonete {
    public static void main(String[] args) {

        // Mostre um menu com 4 itens e preços, leia a escolha e a quantidade e imprima o total.
        // Opção inválida cai no default

        Scanner scanner = new Scanner(System.in);

        double precoHamburguer = 18.00;
        double precoCachorroQuente = 12.00;
        double precoBatataFrita = 10.00;
        double precoRefrigerante = 6.00;

        System.out.println("Bem-vindo à nossa lanchonete!");
        System.out.println("--------- Menu de itens ---------");
        System.out.println("[1]Hambúrguer (R$18,00)");
        System.out.println("[2]Cachorro-quente (R$12,00)");
        System.out.println("[3]Batata frita (R$10,00)");
        System.out.println("[4]Refrigerante (R$6,00)");
        System.out.println("---------------------------------");
        System.out.print("Escolha o seu pedido do menu: ");
        int escolha = scanner.nextInt();

        System.out.println("\nVocê escolheu [" + escolha + "]");
        System.out.print("Escolha a quantidade: ");
        int quantidade = scanner.nextInt();

        System.out.println("");

        switch (escolha) {
            case 1 -> {
                System.out.printf("Você escolheu %d Hambúrguer(es)\n", quantidade);
                System.out.printf("O seu pedido saiu por: R$%.2f", (precoHamburguer * quantidade));
            }
            case 2 -> {
                System.out.printf("Você escolheu %d Cachorro-quente(s)\n", quantidade);
                System.out.printf("O seu pedido saiu por: R$%.2f", (precoCachorroQuente * quantidade));
            }
            case 3 -> {
                System.out.printf("Você escolheu %d Batata-Frita(s)\n", quantidade);
                System.out.printf("O seu pedido saiu por: R$%.2f", (precoBatataFrita * quantidade));
            }
            case 4 -> {
                System.out.printf("Você escolheu %d Refrigerante(s)\n", quantidade);
                System.out.printf("O seu pedido saiu por: R$%.2f", (precoRefrigerante * quantidade));
            }
            default -> System.out.println("Opção inválida! Tente novamente.");
        }

        scanner.close();
    }
}
