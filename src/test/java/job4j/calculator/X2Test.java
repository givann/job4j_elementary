package job4j.calculator;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.calculator.X2;

import static org.junit.Assert.*;

public class X2Test {

    @Test
    public void whenA10B9C0X2Then40() {
        /* Входные параметры. Их будет 4 штуки */
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 40;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */

        int rsl = X2.calc(a, b, c, x);
        /* сравнение полученного значения с ожидаемым */
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA1B1C1X1Then3() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expect = 3;
        int rsl1 = X2.calc(a, b, c, x);
        Assert.assertEquals(expect, rsl1);
    }

    @Test
    public void whenA0B1C1X1Then2() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expect = 2;
        int rsl1 = X2.calc(a, b, c, x);
        Assert.assertEquals(expect, rsl1);
    }

    @Test
    public void whenA0B1C0X1Then2() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expect = 2;
        int rsl1 = X2.calc(a, b, c, x);
        Assert.assertEquals(expect, rsl1);
    }

    @Test
    public void whenA0B1C1X0Then1() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expect = 1;
        int rsl1 = X2.calc(a, b, c, x);
        Assert.assertEquals(expect, rsl1);
    }


}