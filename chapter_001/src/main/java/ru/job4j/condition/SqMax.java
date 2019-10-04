package ru.job4j.condition;

public class SqMax {
    public static int max(int first, int second, int third, int forth) {
        int result = forth;
        if (first > second){
        } else {
        if (first > third) ;
        else if (first > forth) {
            result = first;
        }
        }
         if (second > third) ;
         else if (second > forth) {
                result = second;
            }

         if (third > forth) {
                result = third;
            }
         return result;
    }
}





