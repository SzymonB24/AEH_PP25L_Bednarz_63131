package pl.pp;
import java.util.Scanner;

class mojaTrzeciaAplikacja {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {


            //zamiana dni na tygodnie
            System.out.println("Podaj proszę liczbę dni, którą chcesz przeliczyć na tygodnie: ");


            int x = scanner.nextInt();
            int y, z;

            if (x <= 0) {
                System.out.println("podałeś błędną wartość. Zamykanie programu...");
                break;
            }


            if (x > 0) {
                y = x / 7;    //oblicznie tygodni
                z = x % 7;    // reszta dni
                System.out.println(x + " dni to " + y + " tygodnie i " + z + " dni");
            }

        }
    scanner.close();
    }
}



