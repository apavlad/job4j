package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest4 {
    @Test
    public void whenMax1To2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To3() {
        int result = Max.max(2, 1, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax1T4() {
        int result = Max.max(2, 2, 5, 4);
        assertThat(result, is(5));
    }
}
