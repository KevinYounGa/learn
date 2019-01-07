package com.daidao.learn.pattern.facade;

import org.apache.log4j.Logger;

/**
 * 门面类
 * */
public class ComputerFacade {
    public static final Logger LOGGER = Logger.getLogger(ComputerFacade.class);
    private CPU cpu;
    private Disk disk;
    private Memory memory;

    public ComputerFacade(){
        cpu = new CPU();
        disk = new Disk();
        memory = new Memory();
    }

    public void start(){
        LOGGER.info("computer start begin......");
        cpu.start();
        disk.start();
        memory.start();
        LOGGER.info("computer start end......");
    }

    public void shutdown(){
        LOGGER.info("computer shutdown begin....");
        cpu.shutDown();
        disk.shutDown();
        memory.shutDown();
        LOGGER.info("computer shutdown end.... ");
    }
}
