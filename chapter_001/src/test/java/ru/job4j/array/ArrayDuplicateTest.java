package ru.job4j.array;

import org.junit.Test;
import  static org.hamcrest.collection.IsArrayContainingInOrder.arrayContaining;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate word = new ArrayDuplicate();
        String[] input = new String[] {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] result = word.remove(input);
        String[] expect = new String[]{"Привет", "Мир", "Супер"};
        assertThat(result, arrayContaining(expect));
    }
    //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
}

