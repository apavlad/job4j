package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            String cell = array[index];
            if (cell == null) {
                int k = index - 1;
                while (k < array.length && array[index] == null) {
                    k++;
                    if (k < array.length) {
                        array[index] = array[k];
                        array[k] = null;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }
            public static void main(String[]args) {
                String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
                String[] compressed = compress(input);
                System.out.println();
                for (int index = 0; index < compressed.length; index++) {
                    System.out.print(compressed[index] + " ");
                }
            }
}