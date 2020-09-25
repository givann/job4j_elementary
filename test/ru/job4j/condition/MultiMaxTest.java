package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void whenFirstdMax() {
        int result = MultiMax.max(10, 4, 2);
        assertThat(result, is(10));
    }

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenThirddMax() {
        int result = MultiMax.max(1, 4, 7);
        assertThat(result, is(7));
    }

    @Test
    public void whenAllTheSame() {
        int result = MultiMax.max(4, 4, 4);
        assertThat(result, is(4));
    }
}