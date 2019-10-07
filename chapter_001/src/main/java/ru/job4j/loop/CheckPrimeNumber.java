package ru.job4j.loop;

public class CheckPrimeNumber {

    public boolean check(int num) {
        int n;
        int i = 2;
        int j = 0;
        boolean prime = false;
        for (n = 2; i*i <= n; i++) {
            if (n % i == 0) {
                j = 1;
                int result = j;
            }
        }
          if (j == 1) {
              prime = false;
          }

        return prime;

    }
}
