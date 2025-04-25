public class Konto {

    private String forename; // pole przechowujące cechę imię
    private String surname; // pole przechowujące cechę nazwisko
    private String nrAcc; // pole przechowujące numer konta
    private String mail; // pole przechowujace emial
    private long phone; // pole przechowujac nr telefonu
    private double stanKonta; // pole przechowujace stan konta

    /**
     * Konstruktor z parametrami, które możemy podać przy jego tworzeniu,
     * wykorzystanie "this" pozwala m.in. na skorzystanie z tych samych nazw
     * pól i zmiennych 
     */

    public Konto(String forename, String surname, String nrAcc, String mail, long phone, double stanKonta) {
        this.forename = forename;
        this.surname = surname;
        this.nrAcc = nrAcc;
        this.stanKonta = stanKonta;
        this.mail = mail;
        this.phone = phone;
    }


    // metody klasy określające akcje możliwe do wykonania przez obiekt
    public void basic(){
        System.out.println("Cześć " + forename + " " + surname + "! " + "Stan konta : " + stanKonta + " zł.");
    }

    // metoda wpłaty srodkow
    public double wplata(double cash){
        this.stanKonta += cash;
        System.out.println("Wpłacono " + cash + " zł.");
        return stanKonta;
    }

    //metoda do wyplaty srodkow
    public double wyplata(double cash){
        if (cash <= stanKonta) {
            this.stanKonta -= cash;
            System.out.println("Pobrano " + cash + " zł.");
        }
        else {
            System.out.println("brak wystarczających środków na koncie aby wypłacić " + cash + " zł.");
        }
        return stanKonta;
    }

    //tzw. "gettery" i "settery" pól prywatnych
    public String getForename(){
        return forename;
    }
    public void setForename(String forename){
        this.forename = forename;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getNrAcc(){
        return nrAcc;
    }
    public void setNrAcc(String number){
        this.nrAcc = nrAcc;
    }
    public String getMail(){
        return mail;
    }
    public void setMail(String mail){
        this.mail = mail;
    }
    public long getPhone(){
        return phone;
    }
    public void setPhone(long phone){
        this.phone = phone;
    }
    public double getStanKonta(){
        return stanKonta;
    }
    public void setStanKonta(double stanKonta) {
        this.stanKonta = stanKonta;
    }
}