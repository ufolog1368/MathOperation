package by.jg.komarov.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionTest {

    @Test
    public void getA() {
        var addition = new  Addition();
        addition.setA(30);

        double expected = 30;
        double actual = addition.getA();
        assertEquals(expected, actual, 0);

    }

    @Test
    public void getB() {
        var addition = new  Addition();
        addition.setB(10);

        double expected = 10;
        double actual = addition.getB();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void getD() {
        var addition = new  Addition();
        addition.setD(40);

        double expected = 40;
        double actual = addition.getD();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testEquals() {
        var addition1 = new  Addition();
        addition1.setA(30);
        addition1.setB(10);
        addition1.setD(40);

        var addition2 = new  Addition();
        addition2.setA(30);
        addition2.setB(10);
        addition2.setD(40);

        boolean expected = true;
        boolean actual = addition1.equals(addition2);
        assertEquals(expected, actual);
    }

    @Test
    public void testHashCode() {
    }

    @Test
    public void testToString() {
    }
}