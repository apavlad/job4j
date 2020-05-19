package ru.job4j.pojo;

public class Shop {

    public Product[] delete(Product[] products, int index) {
        Product productes[] = new Product[5];
        productes[0] = new Product("Milk", 10);
        productes[1] = new Product("Bread", 4);
        productes[2] = new Product("Egg", 19);
        System.out.println();
        products[index] = null;
        for (int i = index; i < productes.length - 1; i++) {
            productes[i] = products[i + 1];
            products[productes.length - 1] = null;
            return products;
        }
        return productes;
    }

    public static void main(String[] args) {
        System.out.println();
    }

}
