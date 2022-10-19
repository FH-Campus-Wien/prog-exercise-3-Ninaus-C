package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {

    // Implement all methods as public static

    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
    }
    public static void oneMonthCalendar(int days, int firstday) {

        int i;

        for (i = 0; i < firstday-1; i++)
            System.out.print("   ");

        for (i = 1; i <= days; i++) {
            if (i<10)
                System.out.print(" " + i + " ");
            else
                System.out.print(i + " ");
            if ((firstday + i-1)%7 == 0)
                System.out.println();
        }
    }
}