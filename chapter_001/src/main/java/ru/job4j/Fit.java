package ru.job4j;

/**
 * Программа расчета идеального веса.
 */
public class Fit {
    // CONST константа используемая в формуле для вычисления идеального веса.
    private static final double CONST  =  1.15;

    /**
     * Идеальный вес для мужщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    public double manWeight(double height) {
        return (height - 100) * CONST;

    }

    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    public double womanWeight(double height) {
        return (height - 110) * CONST;
    }
    public static void main(String[] args) {
        Fit fit = new Fit();
        System.out.println(fit.manWeight(180));
        System.out.println(fit.womanWeight(180));
    }
}