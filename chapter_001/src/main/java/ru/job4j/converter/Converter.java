package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }
    public static int rubleToDollar(int value) {
        return value / 60;
    }
    public static int euroToRuble(int euro) {
        return euro * 70;
    }
    public static int dollarToRuble(int dollar) {
        return dollar * 60;
    }
    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollar.");
        int ruble = euro;
        System.out.println(euro + "euro are " + (140) + " ruble.");
        int rubleDollar = dollar;
        System.out.println(dollar + "dollar are " + (140) + " ruble.");
    }
}
