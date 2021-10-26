package com.itfactory.operatii;

import java.util.Scanner;

public class StartEndWith {

    public static void main(String[] args) {
        String mesaj = "Sunt la cel de al patrulea curs de java";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti stringul: ");
        String keyword = scanner.nextLine();

        if (mesaj.startsWith(keyword)) {
            System.out.println("Mesajul incepe cu " + keyword);
        } else if (mesaj.endsWith(keyword)) {
            System.out.println("Mesajul se termina cu " + keyword);
        } else {
            System.out.println("Mesajul nu incepe sau se nu termina cu " + keyword);
        }
    }
}
