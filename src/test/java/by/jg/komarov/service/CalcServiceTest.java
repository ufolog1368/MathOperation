package by.jg.komarov.service;

import by.jg.komarov.bean.Calc;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcServiceTest {

    @Test
    public void additionOfIntegers() {
        Calc calc=new Calc(20,5,100,50);
        CalcService calcService = new CalcService();
        int expected  = 25;
        int actual = calcService.additionOfIntegers(calc);
        assertEquals(expected,actual);
    }

    @Test
    public void multiplicationOfIntegers() {
        Calc calc=new Calc(20,5,100,50);
        CalcService calcService = new CalcService();
        int expected  = 100;
        int actual = calcService.multiplicationOfIntegers(calc);
        assertEquals(expected,actual);
    }

    @Test
    public void subtructionOfIntegers() {
        Calc calc=new Calc(20,5,100,50);
        CalcService calcService = new CalcService();
        int expected  = 15;
        int actual = calcService.subtructionOfIntegers(calc);
        assertEquals(expected,actual);
    }

    @Test
    public void divisionOfIntegers() {
        Calc calc=new Calc(20,5,100,50);
        CalcService calcService = new CalcService();
        int expected  = 4;
        int actual = calcService.divisionOfIntegers(calc);
        assertEquals(expected,actual);
    }

    @Test
    public void remainderOfIntegers() {
        Calc calc=new Calc(20,5,100,50);
        CalcService calcService = new CalcService();
        int expected  = 0;
        int actual = calcService.remainderOfIntegers(calc);
        assertEquals(expected,actual);
    }

    @Test
    public void additionOfLongs() {
        Calc calc=new Calc(20,5,100,50);
        CalcService calcService = new CalcService();
        long expected  = 150;
        long actual = calcService.additionOfLongs(calc);
        assertEquals(expected,actual);
    }
}