package test;

import main.Counter;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CounterTest {

    @Test
    public void EerstTest() {
        // arrange
        int som;

        // act
        som = 34 + 56;

        // assert
        int expected = 90;
        assertEquals(expected, som);
    }

    @Test
    public void TweedeTest() {
        // arrange
        int min;

        // act
        min = 12 - 6;

        // assert
        int expected = 6;
        assertEquals(expected, min);
    }

    @Test
    public void DerdeTest() {
        // arrange
        String s = "abcde";

        // act
        String actual = s.toUpperCase();

        // assert
        String expected = "ABCDE";
        assertEquals(expected, actual);
    }

    @Test
    public void CounterTestAdd() {
        // arrange
        Counter counter = new Counter();

        // act
        counter.add(1);
        counter.add(2);
        counter.add(3);

        // assert
        int expected = 6;
        assertEquals(expected, counter.getTotal());
    }

    @Test
    public void CounterTestAddArray() {
        // arrange
        Counter counter = new Counter();
        int[] numbers = new int[] {1,2,3};

        // act
        counter.add(numbers);

        // assert
        int expected = 6;
        assertEquals(expected, counter.getTotal());
    }

    @Test
    public void CounterTestReset() {
        // arrange
        Counter counter = new Counter();
        int[] numbers = new int[] {1,2,3};

        // act
        counter.add(numbers);
        counter.reset();
        int actual = counter.getTotal();

        // assert
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void CounterTestMaximum() {
        // arrange
        Counter counter = new Counter();
        int[] numbers = new int[] {1,2,3};

        // act
        counter.add(numbers);
        int actual = counter.getMaximum(numbers);

        // assert
        int expected = 3;
        assertEquals(expected, actual);
    }
}
