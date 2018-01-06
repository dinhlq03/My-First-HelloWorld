package org.hm.firstapp;

public class Main {

    public static void main(String[] args) {

        String myMessage = "Le Quoc Dinh";
        System.out.println(showTheMessage(myMessage));

        int a = 20, b = 54;
        System.out.println(calculateMethod(a, b));
    }

    private static String showTheMessage(String message) {
        return "Hello world and how are you " + message;
    }

    private static int calculateMethod(int a, int b) {
        return a + b + 10;
    }
}
