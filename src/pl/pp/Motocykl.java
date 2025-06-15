package pl.pp;

import java.util.*;

public class Motocykl extends Pojazd {
    private boolean posiadaDostawke;

    public Motocykl(String marka, String nrRejestracyjny, String nrVin, String kolor, double cena, double spalanie, double poziomPaliwa, double przebieg, double maxPaliwo, boolean posiadaDostawke, TypPaliwa typPaliwa) {
        super(marka, nrRejestracyjny, nrVin, kolor, cena, spalanie, poziomPaliwa, przebieg, maxPaliwo, typPaliwa);
        this.posiadaDostawke = posiadaDostawke;
    }

    public static List <Motocykl> motocykle() {
        List<Motocykl> lista = new ArrayList<>();
        lista.add(new Motocykl("BMW540z","WAW950","2552","czerwony",490,8.9,12,16790,49,true, new Benzyna()));
        lista.add(new Motocykl("Suzuki XJ","WAW150","2592","niebieski",370,9.9,19,26790,52,false, new Benzyna()));
        return lista;
    }
    public String toString () {
        return marka+ ", kolor: "+ kolor + ", cena za dobę: "+ cena+", paliwo: "+typPaliwa.getTypPaliwa()+ ", spalanie: " + spalanie+", dostawka "+(posiadaDostawke ? "Tak" : "Nie");
    }
}
