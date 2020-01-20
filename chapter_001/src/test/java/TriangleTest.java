package ru.job4j.condition;

import org.junit.Ignore;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@Ignore
public class TriangleTest {
    @Test
    public void whenExist() {
        boolean result = Triangle.exist(5.0, 3.0, 4.0);
        assertThat(result, is(true));
    }
}

