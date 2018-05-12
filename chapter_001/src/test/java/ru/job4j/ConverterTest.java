package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void when60RubleToDollarThen1() {
        Converter conv = new Converter();
        int result = conv.rubleToDollar(60);
        assertThat(result, is(1));
    }

    @Test
    public void when70RubleToEuroThen1() {
        Converter conv = new Converter();
        int result = conv.rubleToEuro(70);
        assertThat(result, is(1));
    }

    @Test
    public void whenOneDollarToRubleThen60() {
        Converter conv = new Converter();
        int result = conv.dollarToDoRuble(1);
        assertThat(result, is(60));
    }

    @Test
    public void whenOneEuroToRubleThen70() {
        Converter conv = new Converter();
        int result = conv.euroToDoRuble(1);
        assertThat(result, is(70));
    }
}
