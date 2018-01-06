package org.hm.firstapp;

public class Main {

    public static void main(String[] args) {

        String myMessage = "Le Quoc Dinh";
        System.out.println(showTheMessage(myMessage));

        int a = 20, b = 54;
        System.out.println(calculateMethod(a, b));

        System.out.println(subMethod(a, b));

        System.out.println(doubleMethod(a));

        System.out.println(divideMethod(a, b));
    }

    private static String showTheMessage(String message) {
        return "Hello world and how are you " + message;
    }

    private static int calculateMethod(int a, int b) {
        return a + b + 10;
    }

    private static int subMethod(int a, int b) {
        return a + 10 - b;
    }

    private static int doubleMethod(int a) {
        return a * 10 * a;
    }

    private static double divideMethod(double a, double b) {
        return  a/b;
    }
}
