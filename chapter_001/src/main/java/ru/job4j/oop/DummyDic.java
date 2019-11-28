package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        eng = "kubyshka";
        return eng;
    }

    public static void main(String[] args) {
        DummyDic eng = new DummyDic();
        String say;
        say = eng.engToRus("kubyshka");
        System.out.println("Неизвестное слово " + say);
    }

}
