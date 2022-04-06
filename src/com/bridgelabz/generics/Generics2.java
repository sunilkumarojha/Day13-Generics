package com.bridgelabz.generics;

public class Generics2 {

    public static Integer compareTo(Integer a, Integer b, Integer c) {
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

        System.out.println("Maximun number out of three is: " + compareTo(5, 7, 8));
    }
}