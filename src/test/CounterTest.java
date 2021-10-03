package test;

import org.junit.Test;
import main.Counter;
import static org.junit.Assert.assertEquals;

public class CounterTest {

    @Test
    public void EerstTest() {
        int som;
        som = 34 + 56;
        int expected = 90;
        assertEquals(expected, som);
    }

    @Test
    public void TweedeTest() {
        int min;
        min = 12 - 6;
        int expected = 6;
        assertEquals(expected, min);
    }

    @Test
    public void DerdeTest() {
        String s = "abcde";
        String actual = s.toUpperCase();
        String expected = "ABCDE";
        assertEquals(expected, actual);
    }

    @Test
    public void CounterTestAdd() {
        Counter counter = new Counter();

        counter.add(1);
        counter.add(2);
        counter.add(3);

        int expected = 6;
        assertEquals(expected, counter.getTotal());
    }

    @Test
    public void CounterTestAddArray() {
        Counter counter = new Counter();

        int[] numbers = new int[] {1,2,3};
        counter.add(numbers);

        int expected = 6;
        assertEquals(expected, counter.getTotal());
    }

    @Test
    public void CounterTestReset() {
        Counter counter = new Counter();

        int[] numbers = new int[] {1,2,3};
        counter.add(numbers);
        counter.reset();

        int actual = counter.getTotal();
        int expected = 0;
        assertEquals(expected, actual);
    }
}
