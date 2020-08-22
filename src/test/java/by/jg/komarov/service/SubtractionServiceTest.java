package by.jg.komarov.service;

import by.jg.komarov.bean.Subtraction;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubtractionServiceTest {

    @Test
    public void dTest() {
        var subtraction = new Subtraction(58, 44,14);
        var subtractionService = new SubtractionService();
        int expected = 14;
        int actual = subtractionService.d(subtraction);
        assertEquals(expected, actual);

    }

    @Test
    public void prininformationTest() {
        var subtraction = new Subtraction(58, 44,14);
        var subtractionService = new SubtractionService();
        String expected = "a = " + subtraction.getA() + "b = " + subtraction.getB() + "d = " + subtraction.getD();
        String actual = subtractionService.Prininformation(subtraction);
        assertEquals(expected, actual);
    }
}