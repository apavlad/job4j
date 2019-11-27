package ru.job4j.oop;

public class DummyDic {
    public String engToRus() {
        String eng = "may-may";
        return eng;
    }
    public static void main(String[] args) {
        DummyDic word = new DummyDic();
        String say = word.engToRus();
        System.out.println("Неизвестное слово " + say);
    }
}
