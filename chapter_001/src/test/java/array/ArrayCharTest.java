package ru.job4j.array;

import org.junit.Ignore;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayCharTest {
    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(false));
    }

    @Ignore
    public static class MatrixCheckTest {
        @Test
        public void whenDataMonoByTrueThenTrue() {
            char[][] input = {
                    {' ', ' ', 'X', ' ', ' '},
                    {' ', ' ', 'X', ' ', ' '},
                    {' ', ' ', 'X', ' ', ' '},
                    {' ', ' ', 'X', ' ', ' '},
                    {' ', ' ', 'X', ' ', ' '},
            };
            boolean result = MatrixCheck.isWin(input);
            assertThat(result, is(true));
        }

        @Test
        public void whenDataNotMonoByTrueThenFalse() {
            char[][] input = {
                    {' ', ' ', 'X', ' ', ' '},
                    {' ', ' ', 'X', ' ', ' '},
                    {' ', 'X', ' ', ' ', ' '},
                    {' ', ' ', 'X', ' ', ' '},
                    {' ', ' ', 'X', ' ', ' '},
            };
            boolean result = MatrixCheck.isWin(input);
            assertThat(result, is(false));
        }
    }
}