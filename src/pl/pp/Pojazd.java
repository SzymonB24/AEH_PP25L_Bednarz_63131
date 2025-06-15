package pl.pp;

public class Pojazd {
    protected String marka;
    protected String nrRejestracyjny;
    protected String nrVin;
    protected String kolor;
    protected double cena;
    protected double spalanie;
    protected double poziomPaliwa;
    protected double przebieg;
    protected double maxPaliwo;
    protected TypPaliwa typPaliwa;

    public Pojazd (String marka, String nrRejestracyjny, String nrVin, String kolor, double cena, double spalanie, double poziomPaliwa, double przebieg, double maxPaliwo, TypPaliwa typPaliwa){
        this.marka = marka;
        this.nrRejestracyjny = nrRejestracyjny;
        this.nrVin = nrVin;
        this.kolor = kolor;
        this.cena = cena;
        this.spalanie = spalanie;
        this.poziomPaliwa = poziomPaliwa;
        this.przebieg = przebieg;
        this.maxPaliwo = maxPaliwo;
        this.typPaliwa = typPaliwa;
    }

    //funkcje
    public double zatankuj (double x) {
        if (x > 0 && x+poziomPaliwa <= maxPaliwo) {
            poziomPaliwa += x;
            System.out.println("Zatankowano " + x + " litrów paliwa.");
        } else if (x+poziomPaliwa > maxPaliwo) {
            poziomPaliwa = maxPaliwo;
            System.out.println("Zatankowano do pełna. "+"Pojemnosc baku to "+ poziomPaliwa + " litrow.");
        }
        else {
            System.out.println("Wprowadziłeś błędną wartość.");
        }
    return poziomPaliwa;
    }

    public void prowadz(double x) {
        if (x > 0) {
            double zuzycie = spalanie/100;
            double maxDystans = poziomPaliwa/zuzycie;

            if (x <= maxDystans) {
                poziomPaliwa -= x * zuzycie;
                przebieg += x;
                System.out.println("Dotarłeś do celu.");
            } else {
                przebieg += maxDystans;
                poziomPaliwa = 0;
                System.out.println("Brak paliwa. Zatankuj !");
            }
        } else {
            System.out.println("Podałeś błędną wartość.");
        }
    }

    //gettery i settery
    public String getMarka() {
        return marka;
    }
    public void setMarka(String marka) {
        this.marka = marka;
    }
    public String getNrRejestracyjny() {
        return nrRejestracyjny;
    }
    public void setNrRejestracyjny(String nrRejestracyjny) {
        this.nrRejestracyjny = nrRejestracyjny;
    }
    public String getNrVin() {
        return nrVin;
    }
    public void setNrVin(String nrVin) {
        this.nrVin = nrVin;
    }
    public String getKolor() {
        return kolor;
    }
    public void setKolor(String kolor) {
        this.kolor = kolor;
    }
    public double getCena() {
        return cena;
    }
    public void setCena(double cena) {
        this.cena = cena;
    }
    public double getSpalanie() {
        return spalanie;
    }
    public void setSpalanie(double spalanie) {
        this.spalanie = spalanie;
    }
    public double getPoziomPaliwa() {
        return poziomPaliwa;
    }
    public void setPoziomPaliwa(double poziomPaliwa) {
        this.poziomPaliwa = poziomPaliwa;
    }
    public double getPrzebieg() {
        return przebieg;
    }
    public void setPrzebieg(double przebieg) {
        this.przebieg = przebieg;
    }
    public double getMaxPaliwo() {
        return maxPaliwo;
    }
    public void setMaxPaliwo(double maxPaliwo) {
        this.maxPaliwo = maxPaliwo;
    }
    public String getTypPaliwa() {
        return typPaliwa.getTypPaliwa();
    }
    public void setTypPaliwa(TypPaliwa typPaliwa) {
        this.typPaliwa = typPaliwa;
    }
}
