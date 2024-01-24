package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("My name is Yelena Shtentsel.");
        System.out.println("I live in Zweibrücken.");

        int amount = 41;
        int coffee = 3;
        int applesWeight = 2;
        int applesPrice = 3;
        int dinnerSum = 12;
        int premium = 150;

        System.out.println("At the end of the day Marta has " + (amount - coffee - (
                applesWeight *applesPrice ) - dinnerSum +premium ) + " Euro.");
    }
}