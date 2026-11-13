package tema01fundamentos.sub02strings;

import java.util.Scanner;

public class ComparaStrings {
    public static void main(String[] args) {

        // Leia duas palavras e imprima o resultado de compareTo entre elas, o de equals e o tamanho de cada uma.
        // Explique em comentário o que significa o número que o compareTo devolve (negativo, zero, positivo).

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();
        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();

        // O metodo [.compareTo()] compara as Strings e retorna um int:
        // Caso as Strings sejam iguais -> 0.
        // Caso as Strings sejam diferentes -> Ele vai percorrendo até achar um caractere diferente e
        // quando encontra ele cálcula a diferença númerica entre o código ASCII dos dois caracteres que diferem.
        // Consequentemente ele também encontra a distância entre esses dois caracteres no alfabeto.
        System.out.println("Resultado do compareTo: " + (palavra1.compareTo(palavra2)));

        // O metodo [.equals()] retorna uma boolean que é true quando as palavras são iguais e false quando não.
        System.out.println("Resultado do equals: " + (palavra1.equals(palavra2)));

        // O metodo [.length()] retorna o tamanho da palavra
        System.out.println("Tamanho da 1: " + (palavra1.length()));
        System.out.println("Tamanho da 2: " + (palavra2.length()));

        scanner.close();

    }
}
