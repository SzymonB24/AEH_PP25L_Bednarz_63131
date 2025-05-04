import java.util.Scanner;
public class mojaDziewiataAplikacja {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Magazyn magazyn = new Magazyn("Tomek","tomek1998@gmail.com","792877553","236",5000 );
        System.out.println("Witaj w programie do zarządzania Twoim magazynem. Magazyn ma pojemność 10000 jednostek." +
                " Obecnie wolne jest " + magazyn.getSpace() + " jednostek.");
        magazyn.dodajTowar(2000);
        magazyn.dodajTowar(5000);
        System.out.println(magazyn.getSpace());
        magazyn.usunTowar(6000);
        magazyn.sprawdzZajetosc();
        magazyn.aktualizujKontakt();
        magazyn.sprawdzZajetosc();
    }
}