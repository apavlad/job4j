package ru.job4j.pojo;

public class Shop {
    public static void main(String[] args) {
        Product products[] = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        System.out.println();
    }

    public Product[] delete(Product[] products, int index) {

        System.out.println();
        products[index] = null;
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
            products[products.length - 1] = null;
            return products;
        }
        return products;
    }



}
