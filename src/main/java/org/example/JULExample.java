package org.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class JULExample {

    private static final Logger logger = Logger.getLogger(JULExample.class.getName());

    public static void main(String[] args) {
logger.log(Level.INFO,"This is an info message");
logger.log(Level.WARNING,"This is a warning message");
logger.log(Level.SEVERE,"This is a severe message");
logger.log(Level.FINE,"This is a fine message");


    }
}
