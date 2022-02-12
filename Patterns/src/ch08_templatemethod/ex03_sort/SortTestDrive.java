package ch08_templatemethod.ex03_sort;

import java.util.Arrays;

public class SortTestDrive {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Daffy", 8),
                new Duck("Dewey", 2),
                new Duck("Howard", 7),
                new Duck("Louie", 2),
                new Duck("Donald", 10),
                new Duck("Huey", 2)
        };

        System.out.println("Before sorting:");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("");
        System.out.println("After sorting:");
        display(ducks);
    }

    public static void display(Duck[] ducks) {
        for (Duck duck : ducks)
            System.out.println(duck);
    }
}
