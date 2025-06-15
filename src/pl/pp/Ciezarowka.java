package pl.pp;
import java.util.*;

public class Ciezarowka extends Pojazd {
    private int ladownosc;

    public Ciezarowka(String marka,String nrRejestracyjny, String nrVin, String kolor, double cena, double spalanie, double poziomPaliwa, double przebieg, double maxPaliwo, int ladownosc, TypPaliwa typPaliwa) {
        super(marka, nrRejestracyjny, nrVin, kolor, cena, spalanie, poziomPaliwa, przebieg, maxPaliwo, typPaliwa);
        this.ladownosc = ladownosc;
    }

    public static List<Ciezarowka> ciezarowka(){
        List<Ciezarowka> lista = new ArrayList<>();
        lista.add(new Ciezarowka("Scania"," RZE245","0693","biały",990,15.8, 23, 98234,98,19,new Diesel()));
        lista.add(new Ciezarowka("SAAB"," WRO245","6693","szary",890,17.8, 13, 198234,102,20,new Benzyna()));
        return lista;
    }

    public String toString () {
        return marka+ ", kolor: "+ kolor + ", cena za dobę: "+ cena+", paliwo: "+typPaliwa.getTypPaliwa()+ ", spalanie: " + spalanie+", ładowność: "+ ladownosc+" ton";
    }
}
