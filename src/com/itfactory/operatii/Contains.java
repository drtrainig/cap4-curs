package com.itfactory.operatii;


import java.util.Scanner;

public class Contains {

    public static void main(String[] args) {
        String wikipedia = "A Java program may be executed by parsing and directly executing the instructions, one at a time. This kind of bytecode interpreter is very portable. Some systems, called dynamic translators, or just-in-time (JIT) compilers, translate bytecode into machine code as necessary at runtime. This makes the virtual machine hardware-specific but does not lose the portability of the bytecode. For example, Java and Smalltalk code is typically stored in bytecode format, which is typically then JIT compiled to translate the bytecode to machine code before execution. This introduces a delay before a program is run, when the bytecode is compiled to native machine code, but improves execution speed considerably compared to interpreting source code directly, normally by around an order of magnitude";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti textul de verificare: ");
        String stringToFind = scanner.nextLine();

        if (wikipedia.contains(stringToFind)) {
            System.out.println("Am gasit stringul '" + stringToFind + "' in text");
        } else {
            System.out.println("Nu am gasit stringul '" + stringToFind + "' in text");
        }
    }
}
