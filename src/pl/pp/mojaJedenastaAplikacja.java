package pl.pp;
import java.util.*;

public class mojaJedenastaAplikacja {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("12345", "Jan", "Kowalski", Arrays.asList(4, 5, 3, 5)),
                new Student("67890", "Anna", "Nowak", Arrays.asList(5, 5, 4, 4)),
                new Student("54321", "Paweł", "Wiśniewski", Arrays.asList(2, 3, 2, 4)),
                new Student("09876", "Katarzyna", "Kowalczyk", Arrays.asList(5, 4, 3, 5))
        );

        for (Student i : students){
            System.out.println(i.getName()+ " "+ i.getSurname()+ ", "+ "("+i.getIndex()+"), "+ i.avg());
        }

        Student best = students.get(0);
        for (Student s : students){
            if (best.avg() < s.avg()){
                best = s;
            }
        }
        System.out.println("Uczeń z najwyższą średnią: "+best.getName()+" "+ best.getSurname()+", "+ best.avg());
    }
}
