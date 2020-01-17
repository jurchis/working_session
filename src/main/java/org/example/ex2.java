package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex2 {

    public static ArrayList<Integer> A = new ArrayList<Integer>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number of Tests contained in [1; 100]: ");
        int numberT = getNumber();

        for (int i = 0; i < numberT; i++) {

            System.out.println("Please enter a number of Queries contained in [1; 100]: ");
            int numberN = getNumber();

            String string = scanner.nextLine();

            String[] queries = string.split(" ");

            for (String a : queries) {
                if (a.length() > 1) {
                    String parameter = a.substring(1, a.length());
                    int parameterValue = Integer.parseInt(parameter);
                    a(parameterValue);
                } else if (a.equals("b")){
                    b(A);
                }
                else if (a.equals("c")){
                    c(A);
                }
                else if (a.equals("d")){
                    d(A);
                }
                else if (a.equals("e")){
                    e(A);
                }
                else {
                    f(A);
                }

            }
//            System.out.println(A);
            A.removeAll(A);


//            System.out.println("Please enter a number of Queries contained in [1; 100]: ");
//            for (int j = 0; j <= numberN; j++) {
//
//        }

        }
    }

    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        int numberT = scanner.nextInt();
        if (numberT < 1 || numberT > 100) {
            System.out.println("Entered number is not in the interval [1; 100]; Try again!");
            getNumber();
        }
        return numberT;
    }

    public static void a(int x) {
        A.add(x);
    }

    public static void b(ArrayList<Integer> A) {

        int temp;
        for (int i = 0; i < A.size() - 1; i++) {
            for (int j = i + 1; j < A.size(); j++) {
                if (A.get(i) > A.get(j)) {
                    temp = A.get(i);
                    A.set(i, A.get(j));
                    A.set(j, temp);
                }
            }

        }
    }

    public static void c(ArrayList<Integer> A) {
        Collections.sort(A, Collections.reverseOrder());
    }

    public static void d(ArrayList<Integer> A) {
        System.out.print(A.size()+" ");
    }

    public static void e(ArrayList<Integer> A) {
        for (int i = 0; i < A.size() - 1; i++) {
            System.out.print(A.get(i) + " ");
        }
        System.out.print(A.get(A.size() - 1) + "\n");
    }

    public static void f(ArrayList<Integer> A) {

        int temp;
        for (int i = 0; i < A.size() - 1; i++) {
            for (int j = i + 1; j < A.size(); j++) {
                if (A.get(i) < A.get(j)) {
                    temp = A.get(i);
                    A.set(i, A.get(j));
                    A.set(j, temp);
                }
            }

        }
    }
}
