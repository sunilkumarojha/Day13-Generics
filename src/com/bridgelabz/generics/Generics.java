package com.bridgelabz.generics;

public class Generics {

 /*   public static Integer compareToInteger(Integer a, Integer b, Integer c) {
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
    public static String compareToString(String str1, String str2, String str3) {
        int a = str1.compareTo(str2);
        int b = str1.compareTo(str3);
        int c = str2.compareTo(str3);
        //    System.out.println(a + " " + b + " " + c);
        if (a > b && a > c) {
            return str1;
        } else if (b > c) {
            return str2;
        } else {
            return str3;
        }
    }                                   */

    // Using Generics Method.
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {

        if (y.compareTo(x) > 0) {
            return y;
        } else if (z.compareTo(y) > 0) {
            return z;
        } else {
            return x;
        }
    }

    public static void main(String[] args) {
        // Welcome to Generics program.

        System.out.println("Maximum number out of three integers is: " + maximum(1, -8, -20));
        System.out.println("Maximum number out of three float is: " + maximum(-5f, -7f, -8f));
        System.out.println("Maximum among three string is: " + maximum("Apple", "Peach", "Banana"));
    }
}