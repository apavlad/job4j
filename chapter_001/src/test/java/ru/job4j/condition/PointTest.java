package ru.job4j.condition;

import org.junit.Ignore;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void distance() {
        Point a = new Point(2, 3, 0);
        Point b = new Point(0, 2, 4);
        Point c = new Point(3, 0, 2);
        double result = a.distance(b);
        double expected = 2.23606797749979;
        assertThat(result, is(expected));


    }
}