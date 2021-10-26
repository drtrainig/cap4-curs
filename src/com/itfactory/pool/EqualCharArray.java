package com.itfactory.pool;

public class EqualCharArray {
    public static void main(String[] args) {
        String mesaj1 = "Mesaj";

        char[] mesajCharArray = {'M', 'e', 's', 'a', 'j'};
        String mesaj2 = new String(mesajCharArray);

        System.out.println(mesaj1 == mesaj2);

    }
}
