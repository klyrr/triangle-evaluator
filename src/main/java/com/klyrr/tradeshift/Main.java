package com.klyrr.tradeshift;

import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {

        final Scanner in = new Scanner(System.in);
        System.out.println("Please enter the length of the three triangle sides:");

        try {
            final int sideA = getNextSide(in);
            final int sideB = getNextSide(in);
            final int sideC = getNextSide(in);

            System.out.println(String.format("The given triangle is %s", TriangleEvaluator.evaluateType(sideA, sideB, sideC)));
        } catch(final IllegalArgumentException e) {
            System.err.println(String.format("Given side length was not a number but %s", in.next()));
            System.err.println("Exiting.");
        }
    }

    private static int getNextSide(final Scanner in) throws IllegalArgumentException {
        System.out.println("Next side:");
        if (in.hasNextInt()) {
            return in.nextInt();
        }

        throw new IllegalArgumentException();
    }
}
