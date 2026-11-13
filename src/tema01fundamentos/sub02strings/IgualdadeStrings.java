package tema01fundamentos.sub02strings;

public class IgualdadeStrings {
    public static void main(String[] args) {

        // Crie String a = "java", String b = "java" e String c = new String("java"). Compare a == b, a == c,
        // a.equals(c) e "JAVA".equalsIgnoreCase(a). Explique em comentário, com suas palavras, por que a == c dá
        // diferente.

        // Quando criamos uma String com aspas duplas, o Java cria e joga ela na String pool, além de fazer
        // a variável [a] apontar pra esse endereço.
        // E a variável [b], simplesmente aponta para o mesmo endereço.
        String a = "java";
        String b = "java";

        // Quando usamos a palavra [new], o Java força a criaçao de um objeto na memória Heap.
        // Logo, [c] aponta para um outro objeto separado em memória.
        String c = new String("java");

        // As três dão true. As duas primeiras estão comparando strings iguais, e a ultima usa um metodo que compara
        // as Strings ignorando a letra maiuscula, logo, também é igual.
        System.out.println(a == b);
        System.out.println(a.equals(c));
        System.out.println("JAVA".equalsIgnoreCase(a));

        // Vai dar false pois o operador [==] compara o endereço de memória, e não o conteúdo dos objetos.
        System.out.println(a == c);

    }
}
