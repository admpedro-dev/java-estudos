package tema01fundamentos.sub02strings;

import java.util.Scanner;

public class TrocaCaracter {
    public static void main(String[] args) {

        // Leia uma palavra, a letra a trocar e a nova letra. Imprima o resultado e quantas trocas ocorreram.
        // Para banana, trocando a por o: bonono e 3 trocas.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a palavra: ");
        String palavra = scanner.nextLine();

        System.out.println("Digite a letra que você quer trocar e por qual letra você quer trocar: ");
        String letraASerTrocada = scanner.nextLine();
        String letraEscolhida = scanner.nextLine();

        String palavraTrocada = palavra.replace(letraASerTrocada, letraEscolhida);

        System.out.println("Palavra com as letras trocadas: " + palavraTrocada);
        System.out.println("Quantidade de letras trocas: " + (palavra.length() - palavra.replace(letraASerTrocada, "").length()));

        scanner.close();
    }
}
