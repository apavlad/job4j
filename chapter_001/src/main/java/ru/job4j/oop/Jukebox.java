package ru.job4j.oop;

public class Jukebox {
    public void music(String lyrics) {
        System.out.println("I can sign a song : " + lyrics);
    }
    public static void main(String[] args) {
        Jukebox box = new Jukebox();
        box.music(1);
    }
    public void music(int pos) {
        if(pos == 1) {
            System.out.println(pos + ": Пусть бегут неуклюже");
        } else if(pos == 2) {
            System.out.println(pos + ": Спокойной ночи");
        } else {
            System.out.println(pos + ": Песня не найдена");
        }
    }
}
