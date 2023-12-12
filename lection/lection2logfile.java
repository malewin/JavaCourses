package lection;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

public class lection2logfile {
    public static void main(String[] args) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(lection2logfile.class.getName());
        FileHandler fh = new FileHandler("log.xml");

        logger.addHandler(fh);

        // SimpleFormatter sFormat = new SimpleFormatter();
        // fh.setFormatter(sFormat);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);

        // logger.setLevel(Level.INFO);
        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");
    }
    
}
