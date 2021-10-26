package com.itfactory.operatii;

import java.util.Scanner;

public class Length {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maximumLength = 25;

        System.out.print("Introduceti numele: ");
        String nume = scanner.nextLine();

        if (nume.length() > maximumLength) {
            System.out.println("Numele dumneavoastra nu se incadreaza in dosar");
        } else {
            System.out.println("Felicitari! Ati introudus numele " + nume + " la dosar");
        }
    }
}
