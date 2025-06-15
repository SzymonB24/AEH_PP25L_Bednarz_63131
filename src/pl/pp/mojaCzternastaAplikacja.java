package pl.pp;
import java.util.*;

public class mojaCzternastaAplikacja {
    public static void main(String[] args) {
        System.out.println("Witamy w wypożyczalni aut Carplex.");
        Scanner scanner = new Scanner(System.in);

        //listy pojazdow
        List<Motocykl> motocyklList = Motocykl.motocykle();
        List<Osobowe> osoboweList = Osobowe.osobowe();
        List<SprzetBudowlany> sprzetBudowlanyList = SprzetBudowlany.sprzetBudowlany();
        List<Ciezarowka> ciezarowkaList = Ciezarowka.ciezarowka();

        //menu wyboru
        System.out.println("Wybierz kategorię pojazdów:");
        System.out.println("1. Osobowe");
        System.out.println("2. Motocykl");
        System.out.println("3. Ciężarówka");
        System.out.println("4. Sprzęt budowlany");
        System.out.print("Twój wybór: ");
        int wybor = scanner.nextInt();

        Pojazd wybranyPojazd = null;

        switch (wybor) {
            case 1:
                System.out.println("Dostępne auta osobowe:");
                for (int i = 0; i < osoboweList.size(); i++) {
                    System.out.println((i + 1) + ". " + osoboweList.get(i));
                }
                System.out.print("Wybierz pojazd: ");
                int wyborOs = scanner.nextInt() - 1;
                if (wyborOs >= 0 && wyborOs < osoboweList.size()) {
                    wybranyPojazd = osoboweList.get(wyborOs);
                }
                break;
            case 2:
                System.out.println("Dostępne motocykle:");
                for (int i = 0; i < motocyklList.size(); i++) {
                    System.out.println((i + 1) + ". " + motocyklList.get(i));
                }
                System.out.print("Wybierz pojazd: ");
                int wyborMot = scanner.nextInt() - 1;
                if (wyborMot >= 0 && wyborMot < motocyklList.size()) {
                    wybranyPojazd = motocyklList.get(wyborMot);
                }
                break;
            case 3:
                System.out.println("Dostępne ciężarówki:");
                for (int i = 0; i < ciezarowkaList.size(); i++) {
                    System.out.println((i + 1) + ". " + ciezarowkaList.get(i));
                }
                System.out.print("Wybierz pojazd: ");
                int wyborC = scanner.nextInt() - 1;
                if (wyborC >= 0 && wyborC < ciezarowkaList.size()) {
                    wybranyPojazd = ciezarowkaList.get(wyborC);
                }
                break;
            case 4:
                System.out.println("Dostępny sprzęt budowlany:");
                for (int i = 0; i < sprzetBudowlanyList.size(); i++) {
                    System.out.println((i + 1) + ". " + sprzetBudowlanyList.get(i));
                }
                System.out.print("Wybierz sprzęt: ");
                int wyborS = scanner.nextInt() - 1;
                if (wyborS >= 0 && wyborS < sprzetBudowlanyList.size()) {
                    wybranyPojazd = sprzetBudowlanyList.get(wyborS);
                }
                break;
            default:
                System.out.println("Nieprawidłowy wybór.");
                return;
        }
        if (wybranyPojazd == null) {
            System.out.println("Nie wybrano pojazdu.");
            return;
        }
        System.out.println("Wybrany pojazd: " + wybranyPojazd.getMarka());
        System.out.println(wybranyPojazd.getPrzebieg());
        System.out.println(wybranyPojazd.getPoziomPaliwa());
        wybranyPojazd.prowadz(20);
        System.out.println(wybranyPojazd.getPrzebieg());
        System.out.println(wybranyPojazd.getPoziomPaliwa());
        wybranyPojazd.zatankuj(10);
        System.out.println(wybranyPojazd.getPoziomPaliwa());
        System.out.println(wybranyPojazd.getTypPaliwa());
    }
}