package ru.job4j;

/**
 * Конвертер валюты.
 */
public class Converter {
    private static final int RUBLE = 1;
    private static final int EURO  = 70;
    private static final int DOLLAR = 60;

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        return value / EURO;

    }
     /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллоры
     */
    public int rubleToDollar(int value) {
        return value / DOLLAR;

    }
    /**
     * Конвертируем доллары в рубли.
     * @param value доллары.
     * @return рубли.
     */
    public int dollarToDoRuble(int value) {
        return value * DOLLAR;

    }
    /**
     * Конвертируем евро в рубли.
     * @param value евро.
     * @return рубли.
     */

    public int euroToDoRuble(int value) {
        return  value * EURO;

    }

    public static void main(String[] args) {
        Converter conv = new Converter();
System.out.println(conv.rubleToEuro(70) + " €");
System.out.println(conv.rubleToDollar(60) + " $");
System.out.println(conv.dollarToDoRuble(1) + " rub");
System.out.println(conv.euroToDoRuble(1) + " rub");
    }
}