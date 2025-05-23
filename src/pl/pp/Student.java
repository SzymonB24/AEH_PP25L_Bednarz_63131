package pl.pp;

import java.util.*;

public class Student {

    private String index;
    private String name;
    private String surname;
    private List<Integer> grades;

    public Student(String index, String name, String surname, List<Integer> grades) {
        this.index = index;
        this.name = name;
        this.surname = surname;
        this.grades = grades;
    }

    public double avg() {
        double sum = 0;
        for (int i : grades) {
            sum += i;
        }
        return sum/grades.size();
    }


    public String getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public List<Integer> getGrades() {
        return grades;
    }
}