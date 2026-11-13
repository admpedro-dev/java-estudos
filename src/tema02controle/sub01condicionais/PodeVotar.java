package tema02controle.sub01condicionais;

import java.util.Scanner;

public class PodeVotar {
    public static void main(String[] args) {

        // Leia a idade. Menos de 16: Proibido. De 16 a 17 ou 70 anos ou mais:
        // Facultativo. De 18 a 69: Obrigatório

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 0) {
            System.out.println("Idade inválida, tente novamente!");
        } else if (idade < 16) {
            System.out.println("Voto proibido!");
        } else if (idade <= 17 || idade >= 70) {
            System.out.println("Voto facultativo!");
        } else {
            System.out.println("Voto obrigatório!");
        }

        scanner.close();
    }
}
