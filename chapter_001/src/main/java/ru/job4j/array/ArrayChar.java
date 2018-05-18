package ru.job4j.array;

import java.util.Arrays;

/**
 * Обертка над строкой.
 */
public class ArrayChar {
    private char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Проверяет. что слово начинается с префикса.
     *
     * @param prefix префикс.
     * @return если слово начинаеться с префикса
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        for (int i = 0; i < value.length - 1; i++) {
            if (data[i] != value[i]) {
                result = false;
                break;
            }
            // проверить. что массив data имеет первые элементы одинаковые с value
        } return result;
    }
}

