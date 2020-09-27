package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void whenBound5Then014916() {
        int bound = 5;
        int[] rst = Square.calculate(bound);
        int[] expect = new int[]{0, 1, 4, 9, 16};
        assertThat(rst, is(expect));
    }


}
