package com.daidao.learn.pattern.facade;

import org.apache.log4j.Logger;

public class CPU {
    public static final Logger LOGGER = Logger.getLogger(CPU.class);

    public void start() {
        LOGGER.info("cpu is start...");
    }

    public void shutDown() {
        LOGGER.info("CPU is shutDown...");
    }
}
