package job4j.condition;

import org.junit.Test;
import ru.job4j.condition.Max;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax5To4Then5() {
        int result = Max.max(5, 4);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax1To4Then4() {
        int result = Max.max(1, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax4To4Then4() {
        int result = Max.max(4, 4);
        assertThat(result, is(4));
    }

    @Test
    public void max() {
    }

    @Test
    public void maxThree() {
        int result = Max.maxThree(4, 4, 5);
        assertThat(result, is(5));
    }

    @Test
    public void maxFour() {
        int result = Max.maxFour(1, 2, 3, 4);
        assertThat(result, is(4));
    }
}