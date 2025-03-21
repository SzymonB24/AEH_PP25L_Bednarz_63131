package pl.pp;
import java.util.Scanner;

class mojaTrzeciaAplikacja {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj proszę liczbę dni, którą chcesz przeliczyć: ");

        while (true) {

            //zamiana dni na tygodnie
            int x = scanner.nextInt();
            int y, z;

            if (x <= 0) {
                System.out.println("Zamykanie programu...");
                break;
            }


            if (x > 0) {
                y = x / 7;    //oblicznie tygodni
                z = x % 7;    // reszta dni
                System.out.println(x + " dni to " + y + " tygodnie i " + z + " dni");
                System.out.println("Spróbuj ponownie lub podaj wartość ujemną aby zakończyć: ");
            }

        }
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
    }
}



