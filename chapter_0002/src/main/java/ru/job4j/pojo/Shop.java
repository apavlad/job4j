package ru.job4j.pojo;

public class Shop {
    public static void main(String[] args) {
        Product productes[] = new Product[5];
        productes[0] = new Product("Milk", 10);
        productes[1] = new Product("Bread", 4);
        productes[2] = new Product("Egg", 19);
        System.out.println();
    }

    public Product[] delete(Product[] productes, int index) {

        System.out.println();
        productes[index] = null;
        for (int i = index; i < productes.length - 1; i++) {
            productes[i] = productes[i + 1];
            productes[productes.length - 1] = null;
            return productes;
        }
        return productes;
    }



}
