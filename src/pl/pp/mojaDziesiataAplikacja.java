package pl.pp;

import java.util.*;

public class mojaDziesiataAplikacja {

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, -1, -2, -3,};
        int[] wynik = countAndSumElements(input);
        System.out.println(Arrays.toString(wynik));
    }

    public static int[] countAndSumElements(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        }

        int liczbaUjemnych = 0;
        int sumaDodatnich = 0;

        for (int i : input) {
            if (i < 0) {
                liczbaUjemnych++;
            } else if (i > 0) {
                sumaDodatnich += i;
            }
        }

        return new int[]{liczbaUjemnych, sumaDodatnich};
    }
}
