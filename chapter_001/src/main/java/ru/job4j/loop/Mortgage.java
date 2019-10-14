package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        int a = amount;
        int s = salary;
        double p = percent;
        while (amount > 0) {
            amount = (int) (a + (a / 100 * p) - s);
            if (amount > 0) {
                year++;
                return amount;
            }

        }
        return year;
    }
}

