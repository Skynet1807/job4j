package ru.job4j.loop;
/**
 *Класс Factorial.
 * @autor Vacheslav Bazhenov (bazhenov36@gmail.com)
 * @version 1.0
 */
public class Factorial {
/**
 * Main.
 * @param args - args.
 */
    int num = 1;
     /**
      * Метод расчета факториала
      * @param n  значение факториала
      * @return коенчный результат
      */
    public int calc(int n) {
        for (int i = 1; i <= n; i++) {
            num = num * i;
        }
        return num;
    }
}
