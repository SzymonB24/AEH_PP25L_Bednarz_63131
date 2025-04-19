import java.util.Scanner;
public class Person {
    // pola (atrybuty) klasy określającej obiekt "Person" (jego parametry/cechy)
    public String forename; // pole przechowujące cechę imię
    public String surname; // pole przechowujące cechę nazwisko
    public int age; // pole przechowujące cechę wiek
    public String address;
    public String birthday;

    /**
     * Konstruktor domyślny - element inicjalizujący pola obiektu podczas jego tworzenia
     * (jeśli sami nie podamy żadnych parametrów)
     */
    public Person() {

    }

    /**
     * Konstruktor z trzema parametrami, które możemy podać przy jego tworzeniu
     */
    public Person(String initForename, String initSurname, int initAge, String initAddress, String initBirthday) {
        forename = initForename;
        surname = initSurname;
        age = initAge;
        address = initAddress;
        birthday = initBirthday;
    }

    // metody klasy określające akcje możliwe do wykonania przez obiekt
    public void hiToAll(){
        System.out.println("Nazywam się " + forename + " " + surname + ". " + "Mam " + age + " lata.");
        System.out.println("Mieszkam w " + address + "." + " Moja data urodzenia to " + birthday);
    }

    // przykładowa metoda growOld, która zwiększa dany wiek obiektu o jeden za każdym jej wywołaniem
    public int growOld(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj o ile chcesz zwiększyć wiek: ");
        int x = scanner.nextInt();
        age = age + x;
        return age;
    }

    public int beYounger(){
        age = age - 1;
        return age;
    }
}
