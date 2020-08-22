package by.jg.komarov.service;

import by.jg.komarov.bean.Subtraction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubtractionService {
    Logger logger = LoggerFactory.getLogger(SubtractionService.class);

    public int d (Subtraction subtraction){
        return subtraction.getA() - subtraction.getB();
    }

    public String Prininformation(Subtraction subtraction){
        logger.info("Check substr");
        return "a = " + subtraction.getA() + "b = " + subtraction.getB() + "d = " + subtraction.getD();
    }

}
