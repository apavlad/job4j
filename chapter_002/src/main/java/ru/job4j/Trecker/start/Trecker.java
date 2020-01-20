package ru.job4j.Trecker.start;

import ru.job4j.Trecker.models.*;

public class Trecker {
    public Item[] items = new Item[3];
    public static void main(String[] args) {
        Trecker trecker = new Trecker();
        trecker.items[0] = new Item("item", "desc", 01);
        trecker.items[1] = new Task("task", "desc");
        trecker.items[2] = new Bug();
        for (Item item : trecker.items) {
            if (item instanceof Task) {
                Task task = (Task) item;
                System.out.println(task.calculatePrice());
            }

            System.out.println(item.getName() + " " + item.getDescription());
        }

    }
}
