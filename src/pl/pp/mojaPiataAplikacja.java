package pl.pp;

import java.util.Scanner;

public class mojaPiataAplikacja {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //pobranie zmiennych
        System.out.print("Podaj liczbe wierszy: ");
        int w = scanner.nextInt();
        System.out.print("Podaj liczbe kolumn: ");
        int k = scanner.nextInt();
        System.out.print("Podaj znak do wyswietlenia: ");
        String z = scanner.next();

        //wywołanie funkcji
        wyswietlTablice(w,k,z);

    }
    //tworzenie funkcji
    public static void wyswietlTablice(int wiersze, int kolumny, String znak) {
        for (int i = 0; i < wiersze; i++) {
            for (int j = 0; j < kolumny; j++) {
                System.out.print(znak + " ");
            }
            System.out.println();
        }
    }
}


