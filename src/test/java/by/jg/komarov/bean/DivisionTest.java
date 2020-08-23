package by.jg.komarov.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionTest {

    @Test
    public void getA() {
        var division = new  Division();
        division.setA(30);

        double expected = 30;
        double actual = division.getA();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void getB() {
        var division = new  Division();
        division.setB(10);

        double expected = 10;
        double actual = division.getB();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void getD() {
        var division = new  Division();
        division.setD(20);

        double expected = 20;
        double actual = division.getD();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testEquals() {
        var division1 = new  Division();
        division1.setA(30);
        division1.setB(10);
        division1.setD(20);

        var division2 = new  Division();
        division2.setA(30);
        division2.setB(10);
        division2.setD(20);

        boolean expected = true;
        boolean actual = division1.equals(division2);
        assertEquals(expected, actual);
    }

    @Test
    public void testHashCode() {
        var division = new  Division();
        division.setA(30);
        division.setB(10);
        division.setD(20);

        int expected = 58951;
        int actual = division.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        var division = new  Division();
        division.setA(30);
        division.setB(10);
        division.setD(20);


        String expected = "Division{a=30, b=10, d=20}";
        String actual = division.toString();
        assertEquals(expected, actual);
    }
}