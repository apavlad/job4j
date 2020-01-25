package ru.job4j.trecker;

public class Item {
    String name;
    public Item() {

    }
    void nameClass() {

        System.out.println("Класс " + name);
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "Animal";
        animal.nameClass();
        Bug bug = new Bug();
        bug.name = "Bug";
        bug.nameClass();
        Predator predator = new Predator();
        predator.name = "Predator";
        predator.nameClass();
        Tiger tiger = new Tiger();
        tiger.name = "Tiger";
        tiger.nameClass();

    }
}
