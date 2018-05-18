package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Turn1Test {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn1 turner = new Turn1();
        int[] input = new int[]{1, 2, 3, 4, 5};
        int[] result = turner.turn(input);
        int[] expect = new int[]{5, 2, 3, 4, 1};
        assertThat(result, is(expect));
    }
}