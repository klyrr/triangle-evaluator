package com.klyrr.tradeshift;

import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {

        final Scanner in = new Scanner(System.in);
        System.out.println("Please enter the length of the three triangle sides:");

        int sideA, sideB, sideC;
        System.out.println("side A");
        if (in.hasNextInt()) {
            sideA = in.nextInt();
        } else {
            System.err.println(String.format("side A was not a number but %s", in.next()));
            return;
        }

        System.out.println("side B");
        if (in.hasNextInt()) {
            sideB = in.nextInt();
        } else {
            System.err.println(String.format("side B was not a number but %s", in.next()));
            return;
        }

        System.out.println("side C");
        if (in.hasNextInt()) {
            sideC = in.nextInt();
        } else {
            System.err.println(String.format("side C was not a number but %s", in.next()));
            return;
        }

        System.out.println(String.format("The given triangle is %s", TriangleValidator.evaluateType(sideA, sideB, sideC)));
    }
}
