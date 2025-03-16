package pl.pp;

import java.util.Scanner;

public class Zaliczenie2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        //prośba o podanie wieku
        System.out.println("Podaj swój wiek: ");
        int age = scanner.nextInt();

        //wiek przeliczony na sekundy
        long WiekWSekundach = (long) age * 365 * 24 * 60 * 60;
        System.out.println("twój wiek przeliczony na sekundy to około " + WiekWSekundach + " sekund");

        scanner.close();
    }
}
