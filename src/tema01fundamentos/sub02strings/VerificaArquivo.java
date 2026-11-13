package tema01fundamentos.sub02strings;

import java.util.Scanner;

public class VerificaArquivo {
    public static void main(String[] args) {

        // Leia o nome de um arquivo e imprima três boolean: se termina com .pdf, se começa com
        // relatorio e se contém a palavra 2026.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do arquivo: ");
        String nomeDoArquivo = scanner.nextLine();

        System.out.println("Termina com PDF: " + nomeDoArquivo.endsWith(".pdf"));
        System.out.println("Começa com relatorio: " + nomeDoArquivo.startsWith("relatorio"));
        System.out.println("Contém a palvra 2026: " + nomeDoArquivo.contains("2026"));

        scanner.close();
    }
}
