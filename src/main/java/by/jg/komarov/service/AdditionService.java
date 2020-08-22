package by.jg.komarov.service;

import by.jg.komarov.bean.Addition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdditionService {
    Logger logger = LoggerFactory.getLogger(AdditionService.class);

    public int d (Addition addition){
        return addition.getA() + addition.getB();
    }

    public String Prininformation(Addition addition){
        logger.info("Check sum");
        return "a = " + addition.getA() + "b = " + addition.getB() + "d = " + addition.getD();
    }


}
