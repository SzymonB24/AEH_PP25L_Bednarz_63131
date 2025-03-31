package pl.pp;
import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kalkulator");

        while(true) {


            System.out.println("Wybierz opcję: ");
            System.out.println("1 - dodawanie");
            System.out.println("2 - odejmowanie");
            System.out.println("3 - mnożenie");
            System.out.println("4 - dzielenie");
            System.out.print("Wybierz tryb: ");
            int x = scanner.nextInt();

            if (x < 1) {
                System.out.println("Wprowadziłeś błędną wartość. Zamykanie...");
                break;
            }

            if (x > 4) {
                System.out.println("Wprowadziłeś błędną wartość. Zamykanie...");
                break;
            }

            System.out.print("podaj pierwszą liczbę: ");
            int y = scanner.nextInt();
            System.out.print("podaj drugą liczbę: ");
            int z = scanner.nextInt();


            if (x == 1) {
                System.out.println(y + "+" + z + "=" + (y + z));
            }

            if (x == 2) {
                System.out.println(y + "-" + z + "=" + (y - z));
            }

            if (x == 3) {
                System.out.println(y + "*" + z + "=" + (y * z));
            }

            if (x == 4) {
                System.out.println(y + ":" + z + "=" + (y / z));
            }

            System.out.println("Spróbuj ponownie");
        }

    }
}
