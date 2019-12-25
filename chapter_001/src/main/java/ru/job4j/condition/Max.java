package ru.job4j.condition;

public class Max {

    public static int max(int first, int second) {
        int result = first > second ? first : second;
        return result;
    }
    public static int max(int first, int second, int third) {
        int tmp = max(second, third);
        int result = first > tmp ? first : tmp;
        return result;
    }
    public static int max(int first, int second, int third, int fourth) {
        int tmp2 = max(second, third, fourth);
        int result = first > tmp2 ? first : tmp2;
        return result;
    }
}
