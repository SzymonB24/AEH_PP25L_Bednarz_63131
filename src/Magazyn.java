import java.util.Scanner;

public class Magazyn {

    private String name;
    private String mail;
    private String phone;
    private String nrMagazine;
    private int space;

    public Magazyn(String name, String mail, String phone, String nrMagazine, int space) {
        this.name = name ;
        this.mail = mail ;
        this.phone = phone ;
        this.nrMagazine = nrMagazine ;
        this.space = space ;
    }
    //funkcje
    public int dodajTowar(int x) {
        if(x+space <= 10000) {
            this.space += x;
            System.out.println("Dodano " + x + " jednostek towaru. Pozostała przestrzeń magazynowa : " + (10000 - space) +" jednostek.");
        }
        else {
            System.out.println("Brak miejsca w magazynie. Wolne :" + (10000 - space) + " jednostek.");
        }
        return space;
    }

    public int usunTowar(int x) {
        if(space-x >=0) {
            this.space -= x;
            System.out.println("Usunieto " + x + " jednostek towaru. Pozostała przestrzeń magazynowa: " + (10000 - space) + " jednostek.");
        }
        else {
            this.space = 0;
            System.out.println("Usunięto całą zawartość magazynu. Twój magazyn jest pusty.");
        }
        return space;
    }

    public void sprawdzZajetosc() {
        System.out.println("Twoj magazyn zawiera: "+ getSpace() + " jednostek. Wolna przestrzeń: " + (10000-space)+ " jednostek.");
    }

    public void aktualizujKontakt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nowy adres email: ");
         String x = scanner.nextLine();
         this.mail = x;
        System.out.println("Podaj nowy numer telefonu: ");
        String y = scanner.nextLine();
        y = this.phone;
        System.out.println("Zaaktualizowano dane: ");
        System.out.println("Nowy e-mail: " + mail );
        System.out.println("Nowy numer telefonu: " + phone);
    }

    //gettery i settery
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getNrMagazine() {
        return nrMagazine;
    }
    public void setNrMagazine(String nrMagazine) {
        this.nrMagazine = nrMagazine;
    }
    public int getSpace() {
        return space;
    }
    public void setSpace(int space) {
        this.space = space;
    }
}