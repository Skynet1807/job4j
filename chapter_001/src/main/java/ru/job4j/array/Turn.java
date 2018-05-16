package ru.job4j.array;

import java.util.Arrays;

public class Turn {

    /**
     * @param array
     * @return
     */

    public   int[] turn(int [] array) {
        for (int i = array.length-1 ; i <array.length; i--) {
            if (i < 0) {
                break;
            }
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array [i]= Math.abs(temp - array.length-1);}
        return  array;
    }

}


