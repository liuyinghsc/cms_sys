package com.cms.test;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import org.junit.Test;
import org.slf4j.LoggerFactory;


public class LoggerbackTest {

    @Test
    public void should_logback_when_logger_given_backlog() {
        ch.qos.logback.classic.Logger palogger = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(LoggerbackTest.class);
        palogger.debug("parent logger");
        palogger.setLevel(Level.INFO);
        Logger logger = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(LoggerbackTest.class);
        palogger.warn("This message is logged because WARN > INFO.");
        palogger.debug("This message is not logged because DEBUG < INFO.");
        logger.info("INFO == INFO");
        logger.debug("DEBUG < INFO");
    }
}
