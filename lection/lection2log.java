package lection;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

public class lection2log {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(lection2log.class.getName());
        ConsoleHandler ch = new ConsoleHandler();

        logger.addHandler(ch);

        // SimpleFormatter sFormat = new SimpleFormatter();
        // ch.setFormatter(sFormat);
        XMLFormatter xml = new XMLFormatter();
        ch.setFormatter(xml);

        // logger.setLevel(Level.INFO);
        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");
    }
    
}
