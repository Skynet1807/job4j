package ru.job4j.array;
/**
 * Программа проверяет заполнен массив true или false.
 */
public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int i = 0; i < data.length-1; i++) {
            if (data[i] != data[i+1]){
                result = false;
                break;
            } else {
                result = true;
            }

        }   return result;
    }
}