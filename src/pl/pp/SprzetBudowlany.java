package pl.pp;
import java.util.*;

public class SprzetBudowlany extends Pojazd {
    private double przepracowaneGodziny;

    public SprzetBudowlany(String marka, String nrRejestracyjny, String nrVin, String kolor, double cena, double spalanie, double poziomPaliwa, double przebieg, double maxPaliwo, double przepracowaneGodziny, TypPaliwa typPaliwa){
        super (marka,nrRejestracyjny,nrVin,kolor,cena,spalanie,poziomPaliwa,przebieg,maxPaliwo, typPaliwa);
        this.przepracowaneGodziny=przepracowaneGodziny;
    }

    public static List<SprzetBudowlany> sprzetBudowlany() {
        List<SprzetBudowlany> lista = new ArrayList<>();
        lista.add(new SprzetBudowlany("Koparka","WWE931","4210","żółty",690,9.5, 20,17890,39,8,new Diesel()));
        lista.add(new SprzetBudowlany("Betoniarka","WRE931","9210","szary",420,12.5, 10,27890,45,5,new Diesel()));
        return lista;
    }


    public String toString () {
        return marka+ ", kolor: "+ kolor + ", cena za dobę: "+ cena+", paliwo: "+typPaliwa.getTypPaliwa()+ ", spalanie: " + spalanie+", przepracowane godziny: "+przepracowaneGodziny;
    }
}
