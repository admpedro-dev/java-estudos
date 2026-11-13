package tema01fundamentos.sub02strings;

import java.util.Scanner;

public class SubstringsEmail {
    public static void main(String[] args) {

        // Leia um e-mail e imprima o usuário e o domínio separados.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um e-mail (...@gmail.com): ");
        String email = scanner.nextLine();

        System.out.println("Usuário: " + email.substring(0, email.indexOf('@')));
        System.out.println("Dominio: " + email.substring(email.indexOf('@')));

        scanner.close();
    }
}
