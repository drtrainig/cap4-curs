package com.itfactory.pool;

public class EqualWrongUsage {
    public static void main(String[] args) {
        String mesaj1 = "Mesaj";
        String mesaj2 = new String("Mesaj");

        System.out.println(mesaj1 == mesaj2);
    }
}
