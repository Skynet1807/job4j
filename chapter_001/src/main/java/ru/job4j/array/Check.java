package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == false) {
                result = false;
                break;
            } else  result = true;
        }return result;
    }
}