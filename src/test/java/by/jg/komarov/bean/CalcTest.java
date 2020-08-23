package by.jg.komarov.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTest {

    @Test
    public void getA() {
        var calc = new Calc();
        calc.setA(30);
        int exepted = 30;
        int actual = calc.getA();
        assertEquals(exepted, actual);

    }

    @Test
    public void getB() {
        var calc = new Calc();
        calc.setB(10);
        int exepted = 10;
        int actual = calc.getB();
        assertEquals(exepted, actual);
    }

    @Test
    public void getC() {
        var calc = new Calc();
        calc.setC(350);
        long exepted = 350;
        long actual = calc.getC();
        assertEquals(exepted, actual);
    }

    @Test
    public void getD() {
        var calc = new Calc();
        calc.setD(300);
        long exepted = 300;
        long actual = calc.getD();
        assertEquals(exepted, actual);
    }

    @Test
    public void testEquals() {
        var calc1 = new Calc();
        calc1.setA(30);
        calc1.setB(10);
        calc1.setC(350);
        calc1.setD(300);

        var calc2 = new Calc();
        calc2.setA(30);
        calc2.setB(10);
        calc2.setC(350);
        calc2.setD(300);
        boolean exepted = true;
        boolean actual = calc1.equals(calc2);
        assertEquals(exepted, actual);
    }

    @Test
    public void testHashCode() {
        var calc = new Calc();
        calc.setA(30);
        calc.setB(10);
        calc.setC(350);
        calc.setD(300);
        long exepted = 1838011;
        long actual = calc.hashCode();
        assertEquals(exepted, actual);

    }

    @Test
    public void testToString() {
        var calc = new Calc();
//        System.out.println("calc.toString() = " + calc.toString());
        String expected = "Calc{a=0, b=0, c=0, d=0}";
        String actual= calc.toString();
        assertEquals(expected, actual);
    }
}