package org.hm.firstapp;

public class Main {

    public static void main(String[] args) {

        String myMessage = "Le Quoc Dinh";
        System.out.println(showTheMessage(myMessage));
    }

    private static String showTheMessage(String message) {
        return "Hello world and how are you " + message;
    }
}
