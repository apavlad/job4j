package ru.job4j.condition;

import org.junit.Ignore;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void distance3d() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 2, 3);
        double result = a.distance3d(b);
        double expected = 3.605551275463989;
        assertThat (result, is( expected));


    }
}