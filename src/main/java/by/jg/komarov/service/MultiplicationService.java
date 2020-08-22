package by.jg.komarov.service;

import by.jg.komarov.bean.Multiplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MultiplicationService {
    Logger logger = LoggerFactory.getLogger(MultiplicationService.class);

    public int d (Multiplication multiplication){
        return multiplication.getA() * multiplication.getB();
    }

    public String Prininformation(Multiplication multiplication){
        logger.info("Check substr");
        return "a = " + multiplication.getA() + "b = " + multiplication.getB() + "d = " + multiplication.getD();
    }


}
