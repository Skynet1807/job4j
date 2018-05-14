package ru.job4j.loop;

/**
 * Board.
 * Построение шахматной доски в псевдографике.
 *
 * @author Vyacheslav Bazhenov (bazhenov36@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Board {
    /**
     * Main.
     * @param width  -  ширина доски.
     * @param  height - высота доски.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // условие проверки, что писать пробел или X
                // Выше в задании мы определили закономерность, когда нужно проставлять X
                if ((i + j) % 2 == 0) {

                    screen.append("X");
                } else {
                        screen.append(" ");
                        }
                    }

            // добавляем перевод на новую строку.
            screen.append(ln);
        }
        return screen.toString();
    }


}

