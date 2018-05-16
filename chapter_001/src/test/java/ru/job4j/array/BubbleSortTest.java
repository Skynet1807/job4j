package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort sort1 = new BubbleSort();
        int[] input = new int[]{1, 22, 3, 14, 46, 54, 18, 25, 71, 21};
        int[] result = sort1.sort(input);
        int[] expect = new int[]{1, 3, 14, 18, 21, 22, 25, 46, 54, 71 };
        assertThat(result, is(expect));

        //напишите здесь тест, проверяющий сортировку массива из 10 элементов методом пузырька, например {1, 5, 4, 2, 3, 1, 7, 8, 0, 5}.
    }
}
