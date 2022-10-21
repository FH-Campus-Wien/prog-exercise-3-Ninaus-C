package at.ac.fhcampuswien;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {

    // Implement all methods as public static

    public static void main(String[] args) {


    }

    public static void oneMonthCalendar(int days, int firstday) {

        int i;
        int linecounter = 0;

        for (i = 0; i < firstday - 1; i++) {
            System.out.print("   ");
            linecounter++;
        }

        for (i = 1; i <= days; i++) {
            if (i < 10)
                System.out.print(" " + i + " ");
            else
                System.out.print(i + " ");
            linecounter++;

            if (linecounter%7==0 && days!=i)
                System.out.println();

        }
        System.out.println();
    }
    // Seedformel: Xi+1 = (aXi+c) mod m
    // m = 2^31, a = 1103515245, c = 12345
    public static long[] lcg(long seed) {
        long[] arr = new long[10];
        long seedI = seed;
        long a = 1103515245;
        long c = 12345;
        long m = (long) Math.pow(2,31);
        for (int i = 0; i < arr.length; i++) {
            //ToDo calculate next seed number
            long seedX = (a*seedI+c)%m;
            //ToDo insert calculated seed number
            arr[i] = seedX;
            seedI = seedX;
        }
        return arr;
    }


    public static void guessingGame(int numberToGuess) {
        Scanner scanner = new Scanner(System.in);
        //second method für numberToGuess number generator

        int tries = 0;
        int guessed;

        for (tries = 1; tries <= 10; tries++) {
            System.out.print("Guess number " + tries + ": ");
            guessed = scanner.nextInt();

            if (guessed == numberToGuess) {
                System.out.print("You won wisenheimer!");
                System.out.println();
                return;
            }
            if (tries == 10) {
                System.out.print("You lost! Have you ever heard of divide & conquer?");
                System.out.println();
                return;
            }
            if (guessed < numberToGuess) {
                System.out.print("The number AI picked is higher than your guess.");
                System.out.println();
            }
            if (guessed > numberToGuess) {
                System.out.print("The number AI picked is lower than your guess.");
                System.out.println();
            }
        }

    }

    public static int randomNumberBetweenOneAndHundred() {
        return new Random().nextInt(100) + 1;
    }

    public static boolean swapArrays(int[] arr1, int[] arr2) {

        boolean result = arr1.length == arr2.length;
        if (!result)
            return result;

        int temp;
        for (int i=0; i < arr1.length; i++){
            temp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = temp;
            }
        return result;
    }
    //32
    public static String camelCase(String sentence) {
        char[] chars = sentence.toCharArray();
        StringBuilder builder = new StringBuilder();
        boolean first = true;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                if (first) {
                    chars[i] -= 32;
                    first = false;
                }
                builder.append(chars[i]);
            } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
                if (!first) {
                    chars[i] += 32;
                }
                first = false;
                builder.append(chars[i]);
            } else if (chars[i] == ' ') {
                first = true;
            }
        }
        return builder.toString();
    }
    public static int checkDigit(int[] code) {
        int product = 0;

        for (int i = 0; i < code.length; i++) {
            product += code[i]*(i+2);
        }
        int temp = product%11;

        int checksum = 11 - temp;

        switch (checksum) {
            case 10:
                checksum=0;
                break;
            case 11:
                checksum=5;
                break;
            default: break;
        }
        return checksum;

    }
}