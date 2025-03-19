// Przepraszam że tworzę drugą klasę ale nie chciało mi działać w jednym pliku
package pl.pp;

import java.util.Scanner;

public class drugiProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Podaj temperaturę w stopniach Fahrenheita : ");

            double F = scanner.nextDouble();  // Wczytanie stopni Fahrenheita

            if (F == -1) {  // zakończenie programu
                System.out.println("Zamykanie...");
                break;
            }

            // Obliczenie temperatur
            double C = (F - 32) / 1.8;        //stopnie Celcjusza
            double K = C + 273.15;            // stopnie Kelwina

            // Wyświetlenie wyników
            System.out.println("Twoja temperatura " + F + " stopni Fahrenheita to:");
            System.out.printf("%.2f stopni Celsjusza%n", C);
            System.out.printf("%.2f stopni Kelwina%n", K);
            System.out.println("jeśli chcesz zakończyć wpisz -1");
        }

        scanner.close();  // Zamknięcie Scanner
    }
}

