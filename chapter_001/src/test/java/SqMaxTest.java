package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenFirstMax() {
        SqMax check = new SqMax();
        int result = check.max(4, 1, 2, 3);
        assertThat(result, is(4));
    }

    @Test
    public void whenSecondMax() {
        SqMax check = new SqMax();
        int result = check.max(1, 8, 3, 5);
        assertThat(result, is(8));
    }

    @Test
    public void whenThirdMax() {
        SqMax check = new SqMax();
        int result = check.max(4, 1, 8, 3);
        assertThat(result, is(8));
    }

    @Test
    public void whenForthMax() {
        SqMax check = new SqMax();
        int result = check.max(4, 2, 3, 5);
        assertThat(result, is(4));
    }

}
