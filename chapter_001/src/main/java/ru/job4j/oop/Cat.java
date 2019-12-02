package ru.job4j.oop;

public class Cat {
    private String barsik;
    public void show() {
        System.out.println(this.barsik);
    }

    public void giveNick(String nick) {
        this.barsik = nick;
    }

    public static void main(String[] args) {
        System.out.println("Барсик съел.");
        Cat barsik = new Cat();
        barsik.giveNick("котлету");
        barsik.show();
    }
}
