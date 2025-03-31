package pl.pp;
import java.util.Scanner;

class mojaCzwartaAplikacja {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            while(true) {

                int suma=0 , i ;

                System.out.print("Podaj dolną granice przedziału: ");
                int x = scanner.nextInt();
                System.out.print("Podaj górną granice przedziału: ");
                int y = scanner.nextInt();


                if (y <= x) {
                    System.out.print("Błędne dane. Zamykanie...");
                    break;
                }

                for (i = x; i <= y; i++) {
                    suma += i * i;
                }

                System.out.println("suma kwadratów od " + x + " do " + y + " wynosi: " + suma);
                System.out.println("Spróbuj ponownie");

            }
        }
}