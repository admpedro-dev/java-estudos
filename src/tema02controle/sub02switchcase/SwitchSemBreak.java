package tema02controle.sub02switchcase;

import java.util.Scanner;

public class SwitchSemBreak {
    public static void main(String[] args) {

        // Leia um número e use um switch antigo (com :)
        // sem break, de propósito. Observe o que acontece e explique em comentário o que é fall-through.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite 1 ou 2: ");
        int num = scanner.nextInt();

        // O fall-trough, acontece quando você nao coloca o break no switch statement antigo.
        // Assim que o programa encontra um caso condizente com a condição, ele vai executar ele e todos os outros
        // blocos de código abaixo dele.
        // E asssim vai permanecer, até ele encontrar um break ou até ele sair do statement.
        switch (num){
            case 1:
                System.out.println("Isso");
            case 2:
                System.out.println("Isso");
            case 3:
                System.out.println("Vai acontecer");
            case 4:
                System.out.println("Se você");
            case 5:
                System.out.println("Não colocar");
            case 6:
                System.out.println("O break");
            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
