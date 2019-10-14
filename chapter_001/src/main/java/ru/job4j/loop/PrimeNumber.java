package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        for (int index = 2; index <= finish; index++) {
            boolean prime = true;
            for (int i = 2; i * i <= index; i++) {
                if (index % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                count++;
            }
        }
        return count;
    }
}
