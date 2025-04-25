public class mojaOsmaAplikacja {

    public static void main(String[] args) {
        Konto person = new Konto("Piotr", "Urban", "4057212290047802", "piotr.urban@gmail.com", 544290933, 1000);
        person.basic();
        person.wplata(237.50);
        System.out.println("Stan konta wynosi " + person.getStanKonta() + " zł.");
        person.wyplata(559.20);
        System.out.println("Stan konta wynosi " + person.getStanKonta() + " zł.");
        person.wyplata(800);
        System.out.println("Stan konta wynosi " + person.getStanKonta() + " zł.");
    }
}