public class mojaSiodmaAplikacja {

    public static void main(String[] args) {

        Person person1 = new Person();

        person1.forename = "Mateusz";
        person1.surname = "Karmazyn";
        person1.age = 24;
        person1.address = "Poznań";
        person1.birthday = "6 luty 2001";
        person1.hiToAll();

        Person person2 = new Person("Dariusz", "Walendziak", 42, "Warszawa","19 kwiecien 1983" );
        person2.hiToAll();

        person1.growOld(); //zwiększanie wieku o wybrana wartość
        person1.hiToAll();
        person2.growOld();
        person2.hiToAll();

        person1.beYounger();
        person2.beYounger();
        person1.hiToAll();
        person2.hiToAll();
    }
}