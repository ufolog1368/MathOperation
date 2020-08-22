package by.jg.komarov.service;

import by.jg.komarov.bean.Division;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DivisionService {
    Logger logger = LoggerFactory.getLogger(DivisionService.class);

    public int d (Division division){
        return division.getA() / division.getB();
    }

    public String Prininformation(Division division){
        logger.info("Check div");
        return "a = " + division.getA() + "b = " + division.getB() + "d = " + division.getD();
    }

}
