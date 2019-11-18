package ru.job4j.condition;

public class SqMax {
    public static int max(int first, int second, int third, int forth) {
        int result = forth;
        if (first > second) {
            result = first;
        } else if (first > third) {
            result = first;
        } else if (first > forth) {
            result = first;
        }
         if (second > third) {
             result = second;
         } else if (second > forth) {
                result = second;
            }
         if (third > forth) {
                result = third;
            }
         return result;
    }
}





