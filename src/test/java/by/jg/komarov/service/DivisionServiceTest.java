package by.jg.komarov.service;

import by.jg.komarov.bean.Division;
import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionServiceTest {

    @Test
    public void dTest() {
        var division = new Division(48, 6, 8 );
        var divisionService = new DivisionService();
        int expected = 8;
        int actual = divisionService.d(division);
        assertEquals(expected, actual);
    }

    @Test
    public void prininformationTest() {
        var division = new Division(48, 6, 8 );
        var divisionService = new DivisionService();
        String expected = "a = " + division.getA() + "b = " + division.getB() + "d = " + division.getD();
        String actual = divisionService.Prininformation(division);
        assertEquals(expected, actual);
    }
}