package tema01fundamentos.sub01variaveis;

import java.util.Scanner;

public class OperadoresDeAtribuicao {
    public static void main(String[] args) {

        // Leia o valor inicial de x (teste com 10) e aplique, imprimindo x a cada passo: x += 5, x -= 3, x *= 2,
        // x /= 4, x %= 3. Depois teste x++, ++x e x--, e descubra a diferença entre int a = x++ e int b = ++x.
        // Explique em comentário.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor inicial de X: ");
        int x = scanner.nextInt();

        // Operador de Atribuição abreviada (+=, -=, *=, /=, %=):
        // Pegam o valor de uma variável, fazem operaçoes com ele e depois guardam de volta na mesma variável.
        // Serve pra fazer essas operaçoes de forma mais limpa e organizada.
        // ex: [x += 5] -> [x = x + 5]
        System.out.println("X += 5: " + (x += 5));
        System.out.println("x -= 3: " + (x -= 3));
        System.out.println("x *= 2: " + (x *= 2));
        System.out.println("x /= 4: " + (x /= 4));
        System.out.println("x %= 3: " + (x %= 3));

        // Operadores de incremento (++ e --):
        // Incrementam e decrementam 1 de uma variável.
        // [x++] vs [++x] -> Diferem no momento do incremento. Na hora de printar, o [x++] só incrementa depois de
        // printar o número original. Já o [++x], primeiro incrementa e depois printa, logo o valor já é o atualizado.
        System.out.println("x++: " + (x++));
        System.out.println("++x: " + (++x));
        System.out.println("x--: " + (x--));

        scanner.close();
    }
}
