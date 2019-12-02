package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);
    }
    public void eat(String meat) {
        this.food = meat;
    }
    public void giveNick(String nick) {
        this.name = nick;
    }
    public static void main(String[] args) {
            Cat gav = new Cat();
            System.out.println("Съел с утра");
            gav.giveNick("Мурзик");
            gav.eat("котлету");
            gav.show();
    }
}
