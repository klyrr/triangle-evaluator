package com.klyrr.tradeshift;

import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {

        final Scanner in = new Scanner(System.in);
        System.out.println("Please enter the length of the three triangle sides:");

        System.out.println("side A");
        final int sideA = in.nextInt();

        System.out.println("side B");
        final int sideB = in.nextInt();

        System.out.println("side C");
        final int sideC = in.nextInt();

        System.out.println(String.format("Your triangle is %s", TriangleType.SCALENE));
    }
}
