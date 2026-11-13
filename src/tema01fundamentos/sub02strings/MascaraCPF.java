package tema01fundamentos.sub02strings;

import java.util.Scanner;

public class MascaraCPF {
    public static void main(String[] args) {

        // Leia um CPF com 11 dígitos, sem pontuação, e imprima formatado.
        // Para 12345678900: 123.456.789-00.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu CPF sem pontuação: ");
        String cpf = scanner.nextLine();

        System.out.println("Seu CPF formatado é: " + cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9));

        scanner.close();
    }
}
