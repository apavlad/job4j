package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String world) {
        world = "Неизвестное слово";
        return world;
    }
    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        String eng = dic.engToRus("kuku");
        System.out.println("kuku - " + eng);
    }
}
