package com.itfactory.operatii;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti mesajul: ");
        String mesaj = scanner.nextLine();
        String mesajNou = mesaj.replace("testare", "java");

        System.out.println("Mesaj vechi: " + mesaj);
        System.out.println("Mesaj nou  : " + mesajNou);

    }
}
