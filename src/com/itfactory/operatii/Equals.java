package com.itfactory.operatii;

import java.util.Scanner;

public class Equals {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user = "it";
        String password = "factory";

        System.out.print("Introduceti userul: ");
        String userInsert = scanner.nextLine();
        System.out.print("Introduceti parola: ");
        String passwordInsert = scanner.nextLine();

        if (userInsert.equals(user) && passwordInsert.equals(password)) {
            System.out.println("Ati introdus credentialele corect");
        } else {
            System.out.println("Ati introdus credentialele gresit");
        }
    }
}
