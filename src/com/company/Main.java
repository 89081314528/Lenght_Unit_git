package com.company;

public class Main {

    public static void main(String[] args) {
        Kilometer km = new Kilometer(new Meters(10000.00));
        Meters m = new Meters(1.00);
        Mile mil = new Mile(new Kilometer(5.00));
        Centimeter cm = new Centimeter(1.00);

        System.out.println(km.amountInConventionalUnit());
        System.out.println(m.getAmount());
        System.out.println(mil.getAmount());
        System.out.println(cm.getAmount());

        System.out.println(km.amountInUnit());
        System.out.println(mil.amountInUnit());

    }

}
