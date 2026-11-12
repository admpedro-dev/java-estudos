package tema01fundamentos.sub01variaveis;

import java.util.Scanner;

public class SegundosParaDias {
    public static void main(String[] args) {

        // Leia um total de segundos e converta para dias, horas, minutos e segundos. Para 90.005
        // saída esperada: 1d 1h 0m 5s.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de segundos: ");
        int qtSegundos = scanner.nextInt();

        int dias = qtSegundos / 86400;
        int restoDias = qtSegundos % 86400;

        int horas = restoDias / 3600;
        int restoHoras = restoDias % 3600;

        int minutos = restoHoras / 60;
        int segundos = restoHoras % 60;

        System.out.printf("%dd %dh %dm %ds", dias, horas, minutos, segundos);

        scanner.close();

    }
}
