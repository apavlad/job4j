package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest2 {

    @Test
    public void whenArrayHasLength5Then0() {
        int[] input = new int[] {5, 10, 3, 8, 1};
        int el = 5;
        int start = 1;
        int finish = 3;
        int result = FindLoop2.indexOf(input, el, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop2.indexOf(input, el, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }
}