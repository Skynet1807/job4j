package ru.job4j.max;

public class Max {

    public int max(int first, int second) {
        return first > second ? first : second;
    }

    public int max(int first, int second, int third) {
        int temp = this.max(first, second);
        int maxOfNum = Math.max(temp, third);
        return maxOfNum;
    }

}
