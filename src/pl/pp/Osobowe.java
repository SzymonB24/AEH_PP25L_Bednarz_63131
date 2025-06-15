package pl.pp;
import java.util.*;

public class Osobowe extends Pojazd {
    private int liczbaDrzwi;

    public Osobowe(String marka, String nrRejestracyjny, String nrVin, String kolor, double cena, double spalanie, double poziomPaliwa, double przebieg, double maxPaliwo, int liczbaDrzwi, TypPaliwa typPaliwa){
        super (marka, nrRejestracyjny,nrVin,kolor,cena,spalanie,poziomPaliwa,przebieg,maxPaliwo,typPaliwa);
        this.liczbaDrzwi=liczbaDrzwi;
    }

    public static List <Osobowe> osobowe() {
        List <Osobowe> lista = new ArrayList<>();
        lista.add(new Osobowe("Mercedes","WAW93P","7853","czarny",780,7.8,32,56200,72,5, new Benzyna()));
        lista.add(new Osobowe("Volvo","WAW23P","7563","biały",410,5.8,12,96200,66,5, new Diesel()));
        return lista;
    }

    public String toString () {
        return marka+ ", kolor: "+ kolor + ", cena za dobę: "+ cena+", paliwo: "+typPaliwa.getTypPaliwa()+ ", spalanie: " + spalanie+", liczba drzwi: "+liczbaDrzwi;
    }
}


