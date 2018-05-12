package ru.job4j;

/**
 * Конвертер валюты.
 */
public class Converter {
   public int ruble=1;
   public int euro=70;
   public int dollar=60;

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        ruble = value/euro;
        return ruble;
    }
     /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллоры
     */
    public int rubleToDollar(int value) {
        ruble = value/dollar;
        return ruble;
    }
    /**
     * Конвертируем доллары в рубли.
     * @param value доллары.
     * @return рубли.
     */
    public int dollarToDoRuble (int value) {
        dollar = value*dollar;
        return dollar;}
    /**
     * Конвертируем евро в рубли.
     * @param value евро.
     * @return рубли.
     */

    public int euroToDoRuble (int value) {
        euro = value*euro;
        return euro;}

    public static void main(String[] args) {
        Converter conv = new Converter();
System.out.println(conv.rubleToEuro(70) +" €");
System.out.println(conv.rubleToDollar(60)+" $");
System.out.println(conv.dollarToDoRuble(1)+" rub");
System.out.println(conv.euroToDoRuble(1)+" rub");
    }
}