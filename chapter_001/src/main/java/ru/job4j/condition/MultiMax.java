package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int Value = first > second ? first : second;
        int maxValue = Value > third ? Value : third;
        return maxValue;
    }
}
