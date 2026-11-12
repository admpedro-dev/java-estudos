package tema01fundamentos.sub01variaveis;

import java.util.Scanner;

public class PodeDirigir {
    public static void main(String[] args) {

        // Leia idade (int) e temCarteira (boolean, digitando true ou false). Imprima idade >= 18 && temCarteira.
        // Rode 4 vezes com combinações diferentes e anote os resultados em comentário (tabela verdade na prática).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Você tem carteira? (true ou false): ");
        boolean temCarteira = scanner.nextBoolean();

        // V e V = V
        // V e F = F
        // F e V = F
        // F e F = F
        System.out.println("Maior de idade e tem carteira: " + (idade >= 18 && temCarteira));

        scanner.close();

    }
}
