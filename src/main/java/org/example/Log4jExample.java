package org.example;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Log4jExample {

    private static final Logger logger = Logger.getLogger(Log4jExample.class);
    public static void main(String[] args) {
        BasicConfigurator.configure();
        logger.info("this is an info message");
        logger.warn("this is a warn message");
        logger.error("this is a error message");

    }
}
