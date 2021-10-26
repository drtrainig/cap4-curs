package com.itfactory.pool;

public class EqualUsage {
    public static void main(String[] args) {
        String mesaj1 = "Mesaj";
        String mesaj2 = "Mesaj";
        System.out.println(mesaj1 == mesaj2);

        mesaj2 = "Mesaj";
        System.out.println(mesaj1 == mesaj2);
    }
}
