package by.jg.komarov.service;

import by.jg.komarov.bean.Addition;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionServiceTest {

    @Test
    public void d() {
        Addition addition = new Addition(67, 34, 101);
        AdditionService additionService = new AdditionService();
        int  expected = 101;
        int actual = additionService.d(addition);
        assertEquals(expected, actual);


    }

    @Test
    public void prininformation() {
        Addition addition = new Addition(67, 34, 101);
        AdditionService additionService = new AdditionService();
        String  expected = "a = " + addition.getA() + "b = " + addition.getB() + "d = " + addition.getD();
        String actual = additionService.Prininformation(addition) ;
        assertEquals(expected, actual);

    }
}