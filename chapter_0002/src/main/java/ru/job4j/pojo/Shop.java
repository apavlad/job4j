package ru.job4j.pojo;

public class Shop {
    Product products[] = new Product[5];
    products[0] = new Product("Milk", 10);
    products[1] = new Product("Bread", 4);
    products[2] = new Product("Egg", 19);
    System.out.println();
    public Product[] delete(Product[] products, int index) {
        products[index] = null;
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
            products[products.length - 1] = null;
            return products;
        }
    }

    public static void main(String[] args) {
        System.out.println();
    }

}
