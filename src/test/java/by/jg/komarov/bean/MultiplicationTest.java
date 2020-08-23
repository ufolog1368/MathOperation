package by.jg.komarov.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationTest {

    @Test
    public void getA() {
        var multiplication = new  Multiplication();
        multiplication.setA(30);

        double expected = 30;
        double actual = multiplication.getA();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void getB() {
        var multiplication = new  Multiplication();
        multiplication.setB(10);

        double expected = 10;
        double actual = multiplication.getB();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void getD() {
        var multiplication = new  Multiplication();
        multiplication.setD(300);

        double expected = 300;
        double actual = multiplication.getD();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testEquals() {
        var multiplication1 = new  Multiplication();
        multiplication1.setA(30);
        multiplication1.setB(10);
        multiplication1.setD(300);

        var multiplication2 = new  Multiplication();
        multiplication2.setA(30);
        multiplication2.setB(10);
        multiplication2.setD(300);

        boolean expected = true;
        boolean actual = multiplication1.equals(multiplication2);
        assertEquals(expected, actual);
    }

    @Test
    public void testHashCode() {
        var multiplication = new  Division();
        multiplication.setA(30);
        multiplication.setB(10);
        multiplication.setD(300);

        int expected = 59231;
        int actual = multiplication.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        var multiplication = new  Multiplication();
        multiplication.setA(30);
        multiplication.setB(10);
        multiplication.setD(20);


        String expected = "Multiplication{a=30, b=10, d=20}";
        String actual = multiplication.toString();
        assertEquals(expected, actual);
    }
}