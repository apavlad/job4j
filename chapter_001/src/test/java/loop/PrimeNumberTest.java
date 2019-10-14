package loop;

import org.junit.Test;
import ru.job4j.loop.PrimeNumber;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PrimeNumberTest {
    @Test
    public void when5() {
        PrimeNumber prime = new PrimeNumber();
        int rsl = prime.calc(5);
        assertThat(rsl, is(3));
    }

    @Test
    public void when11() {
        PrimeNumber prime = new PrimeNumber();
        int rsl = prime.calc(11);
        assertThat(rsl, is(5));
    }

    @Test
    public void when1() {
        PrimeNumber prime = new PrimeNumber();
        int rsl = prime.calc(2);
        assertThat(rsl, is(1));
    }
}
