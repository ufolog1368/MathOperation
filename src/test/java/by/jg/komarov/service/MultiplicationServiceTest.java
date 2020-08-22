package by.jg.komarov.service;

import by.jg.komarov.bean.Multiplication;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationServiceTest {

    @Test
    public void dTest() {
        var multiplucation = new Multiplication(45, 20, 900);
        var multiplucationService = new MultiplicationService();
        int expected = 900;
        int actual = multiplucationService.d(multiplucation);
        assertEquals(expected, actual);


    }

    @Test
    public void prininformationTest() {
        var multiplucation = new Multiplication(45, 20, 900);
        var multiplucationService = new MultiplicationService();
        String expected = "a = " + multiplucation.getA() + "b = " + multiplucation.getB() + "d = " + multiplucation.getD();
        String actual = multiplucationService.Prininformation(multiplucation);
        assertEquals(expected, actual);
    }
}