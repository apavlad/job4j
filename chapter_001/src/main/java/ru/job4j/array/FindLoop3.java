package ru.job4j.array;

public class FindLoop3 {
    public static void main(String[] args) {
        int[] data = {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int rst;
        for (int i = 0; i < data.length; i++) {
            if (data[i] >= start && data[i] <= finish && data[i] == el) {
                rst = i;
                System.out.println(rst);
            }
            System.out.println();
        }
    }
}
