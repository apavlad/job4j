package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book b1 = new Book("Ostrov", 100);
        Book b2 = new Book("Grachy", 114);
        Book b3 = new Book("Utro", 192);
        Book b4 = new Book("Clean code", 202);
        Book[] books = new Book[4];
        books[0] = b1;
        books[1] = b2;
        books[2] = b3;
        books[3] = b4;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getPages());
        }
        System.out.println();
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getPages());
        }
        System.out.println();
        for (int index = 0; index < books.length; index++) {
            if (books[index].getName().equals("Clean code")) {
                System.out.println(books[index].getName());
            }

        }
    }
}