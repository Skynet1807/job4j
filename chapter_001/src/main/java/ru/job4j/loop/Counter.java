package ru.job4j.loop;

public class Counter {
    int count = 0;

    public int add(int start, int finish)  {
        for (int i = 1; i <= finish; i++) {
            if ((i % 2) == 0) {
                count = count + i;
            }
        }
        return count; }
public static void main(String[]args) {
        Counter cun = new Counter();
        System.out.println(cun.add(0, 10));
}
}
