package com.bridgelabz.generics;

public class Generics3 {
    public static Integer compareToInteger(Integer a, Integer b, Integer c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static Float compareToFloat(Float a, Float b, Float c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }


    public static void main(String[] args) {
        // Welcome to Generics program.

        System.out.println("Maximum number out of three is: " + compareToInteger(5, 7, 8));
        System.out.println("Maximum number out of three is: " + compareToFloat(-5f, -7f, -8f));
    }
}
