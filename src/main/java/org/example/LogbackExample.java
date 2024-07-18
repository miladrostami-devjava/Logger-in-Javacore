package org.example;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

public class LogbackExample {
    private static final Logger logger = (Logger) LoggerFactory.getLogger(LogbackExample.class);

    public static void main(String[] args) {
        logger.info("this is an info message");
        logger.warn("this is a warn message");
        logger.error("this is a error message");
    }
}
