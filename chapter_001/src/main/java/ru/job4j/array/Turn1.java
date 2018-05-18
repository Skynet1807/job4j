package ru.job4j.array;

import java.util.Arrays;

public class Turn1 {
    /**
     * @param array
     * @return
     */

    public   int[] turn(int[] array) {
        int i = array.length -1;
        int j = 0;
        array [j] = i;
        array [i] = j;
        return  array;
          }

    }



