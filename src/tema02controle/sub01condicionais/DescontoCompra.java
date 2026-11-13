package tema02controle.sub01condicionais;

import java.util.Scanner;

public class DescontoCompra {
    public static void main(String[] args) {

        // Leia o valor da compra. Até R$ 100: sem desconto. Acima de R$ 100 até R$ 500: 5%. Acima de R$ 500: 10%.
        // Imprima o valor original, o desconto e o valor final.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorInicial = scanner.nextDouble();
        double valorComDesconto = 0;
        int desconto = 0;

        if (valorInicial <= 100) {
            valorComDesconto = valorInicial;
        } else if (valorInicial > 100 && valorInicial <= 500) {
            valorComDesconto = valorInicial * 0.95;
            desconto = 5;
        } else if (valorInicial > 500) {
            valorComDesconto = valorInicial * 0.90;
            desconto = 10;
        }

        if (valorInicial >= 0) {
            System.out.println("\n-------- A sua compra ficou assim: --------");
            System.out.printf("Valor original sem desconto: R$%.2f\n", valorInicial);
            System.out.printf("Desconto aplicado de: %d%%\n", desconto);
            System.out.printf("Valor final de: R$%.2f\n", valorComDesconto);
            System.out.printf("Você economizou um total de: R$%.2f\n", (valorInicial - valorComDesconto));
        } else {
            System.out.println("Valor inválido! Tente novamente.");
        }

        scanner.close();
    }
}
