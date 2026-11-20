    package tema02controle.sub03lacos;

    import java.util.Scanner;

    public class CifraDeCesar {
        public static void main(String[] args) {

            // Leia uma palavra em minúsculas e desloque cada letra 3 posições (z volta para c).

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite uma palavra: ");
            String palavra = scanner.nextLine().toLowerCase();

            for (int i = 0; i < palavra.length(); i++) {
                char letraAtual = palavra.charAt(i);

                if (letraAtual >= 'a' && letraAtual <= 'z') {
                    char letraCifrada = (char)('a' + (letraAtual - 'a' + 3) % 26);
                    System.out.print(letraCifrada);
                } else {
                    System.out.print(letraAtual);
                }
            }

            scanner.close();
        }
    }
