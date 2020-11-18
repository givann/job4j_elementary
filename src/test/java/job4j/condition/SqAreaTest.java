package job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.SqArea;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void when10to2SquareThen2() {
        int expected = 2;
        int p = 10;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to1SquareThen2() {
        int expected = 4;
        int p = 10;
        int k = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to3SquareThen3() {
        int expected = 3;
        int p = 10;
        int k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}