package loop;

import org.junit.Test;
import ru.job4j.loop.Counter;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 0;
        int finish = 10;
        int sum = Counter.add(0, 10);
        assertThat(sum, is(30));
    }
}

