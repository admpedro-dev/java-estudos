package tema01fundamentos.sub01variaveis;

import java.util.Scanner;

public class TrocoDaCompra {
    public static void main(String[] args) {

        // Leia o valor da compra e o valor pago. Imprima o troco.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();
        System.out.print("Digite o valor pago: ");
        double valorPago = scanner.nextDouble();

        double troco = valorPago - valorCompra;

        // Valor negativo significa pagamento insuficiente, será tratado com if no tema de condicionais
        System.out.printf("O troco é de: R$%.2f.", troco);

        scanner.close();

    }
}
