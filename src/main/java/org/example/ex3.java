package org.example;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberT = getNumberT();

        for (int i = 0; i < numberT; i++) {
            int numberN = getNumberN();
            int sumP = 0;
            int sumI = 0;

            for (int j = 0; j <= numberN; j++) {
                if (j % 2 == 0) {
                    sumP += j;
                } else {
                    sumI += j;
                }
            }
            System.out.println(sumP+" "+sumI);
        }

    }

    public static int getNumberT() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number of Tests contained in [1; 200]: ");
        int numberT = scanner.nextInt();
        if (numberT < 1 || numberT > 200) {
            System.out.println("Number T is not in the interval [1; 200]; Try again!");
            getNumberT();
        }
        return numberT;
    }

    public static int getNumberN() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number contained in [1; 10000]: ");
        int numberT = scanner.nextInt();
        if (numberT < 1 || numberT > 10000) {
            System.out.println("Your number is not in the interval [1; 10000]; Try again!");
            getNumberN();
        }
        return numberT;
    }
}
