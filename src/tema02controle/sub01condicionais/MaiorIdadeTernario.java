package tema02controle.sub01condicionais;

import java.util.Scanner;

public class MaiorIdadeTernario {
    public static void main(String[] args) {

        // Leia a idade e use o operador ternário para imprimir Maior de idade ou Menor de idade

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        String verificacao = (idade >= 18) ? "Maior de idade!" : "Menor de idade!";

        System.out.println(verificacao);

        scanner.close();
    }
}
