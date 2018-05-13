package ru.job4j.loop;
import java.util.StringJoiner;
import java.util.function.BiPredicate;
/**
 *
 * @author Vyacheslav Bazhenov (bazhenov36@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Paint {
    /**
     * метод  который должен рисовать правую сторону пирамиды из символа ^ и пробелов
     *
     * @param height -   это высота пирамиды.
     */

    public String rightTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= column
        );
    }

    public String leftTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= height - column - 1
        );
    }

    public String pyramid(int height) {
        return this.loopBy(
                height,
                2 * height - 1,
                (row, column) -> row >= height - column - 1 && row + height - 1 >= column
        );
    }

    private String loopBy(int height, int weight, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (predict.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}
