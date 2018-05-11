package ru.job4j;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }


    @Test
    public void whenSubtractTwoMinusOneThenOne() {

            Calculator calc1 = new Calculator();
            calc1.subtract(2D, 1D);
            double result = calc1.getResult();
            double expected = 1D;
            assertThat(result, is(expected));
        }
    @Test
    public void whenDivTwoDelOneThenTwo() {

        Calculator calc2 = new Calculator();
        calc2.div(2D, 1D);
        double result = calc2.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenMultipleTwoMultTwoThenFor() {

        Calculator calc3 = new Calculator();
        calc3.multiple(2D, 2D);
        double result = calc3.getResult();
        double expected = 4D;
        assertThat(result, is(expected));
    }
    }



