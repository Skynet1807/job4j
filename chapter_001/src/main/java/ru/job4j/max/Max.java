package ru.job4j.max;

public class Max {

    public int max(int first, int second) {
        int result = first > second ? first : second;
        return result;
    }

    public int max(int first, int second, int third) {
        int temp = this.max(first, second);
        int maxOfNum = Math.max(temp, third);
        return maxOfNum;
    }

}
