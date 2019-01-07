package com.daidao.learn.pattern.facade;

import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * 外观模式
 */

public class Client {


    public static final Logger LOGGER = Logger.getLogger(Client.class);

    @Test
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
        LOGGER.info("=================");
        computer.shutdown();
    }


}
