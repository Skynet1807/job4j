package ru.job4j.array;
import java.util.Arrays;

public class ArrayDuplicate {
    public String[] remove(String[] array) {
        int unicum = array.length;
        for (int out = 0; out < unicum; out++) {
            for (int in = out + 1; in < unicum; in++) {
                if (array[out].equals(array[in])) {
                    array[in] = array[unicum - 1];
                    unicum--;
                    in--;
                }
            }
        }
        return Arrays.copyOf(array, unicum);
    }
}
