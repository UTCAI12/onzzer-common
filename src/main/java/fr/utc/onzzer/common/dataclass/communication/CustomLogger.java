package fr.utc.onzzer.common.dataclass.communication;

import java.util.logging.*;

public class CustomLogger {
    private static CustomLogger instance;
    private Logger logger;

    private CustomLogger() {
        logger = Logger.getLogger(CustomLogger.class.getName());
    }

    public static CustomLogger getInstance() {
        if (instance == null) {
            synchronized (CustomLogger.class) {
                if (instance == null) {
                    instance = new CustomLogger();
                }
            }
        }
        return instance;
    }

    public Logger getLogger() {
        return logger;
    }
}
