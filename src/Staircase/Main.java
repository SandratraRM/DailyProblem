package Staircase;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Normal avec n = 4: " + Staircase.normal(4));
        Staircase.print(0, 4, new int[]{1, 2}, new ArrayList<>());

        System.out.println("Avec une rangée de pas n = 4 et pas = 3: " + Staircase.withAmaxRange(4, 3));
        Staircase.print(0, 4, new int[]{1, 2, 3}, new ArrayList<>());

        System.out.println("Avec un ensemble de pas {1,3,5} et n = 5 : " + Staircase.withCustomSteps(5, new int[]{1, 3, 5}));
        Staircase.print(0, 5, new int[]{1, 3, 5}, new ArrayList<>());

    }

}
