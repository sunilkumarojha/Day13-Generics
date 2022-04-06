package com.bridgelabz.generics;

public class Generics1<T extends Comparable<T>> {

    T x;
    T y;
    T z;

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

    Generics(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T maximum() {

        if (y.compareTo(x) > 0) {
            return y;
        } else if (y.compareTo(z) > 0) {
            return z;
        } else {
            return x;
        }
    }

    public static void main(String[] args) {
        // Welcome to Generics program.
        Generics compareInteger = new Generics(10, 20, 7);
        System.out.println("Maximum number out of three integers is: " + compareInteger.maximum());
        Generics comapreFloat = new Generics1<>(-6, -4, -9);
        System.out.println("Maximum number out of three float is: " + comapreFloat.maximum());
        Generics compareString = new Generics("Amol", "Dinkar", "Ghotale");
        System.out.println("Maximum among three string is: " + compareString.maximum());
    }
}
