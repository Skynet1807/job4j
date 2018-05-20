package ru.job4j.array;
import java.util.Arrays;

public class Turn {

    /**
     * @param array
     * @return
     */
    public   int[] turn(int [] array) {
         for (int i = 0; i < array.length/2 ; i++) {
             int counte = array [i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = counte;
        }
        return  array;
    }

}