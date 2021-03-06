package com.daidao.learn.pattern.interpreter;

import org.junit.Test;
/**
 * 解释器模式
 * */
public class Client{
    @Test
    public static void main(String args[]){
        String statement = "3 * 2 * 4 / 6 % 5";

        Calculator calculator = new Calculator();

        calculator.build(statement);

        int result = calculator.compute();

        System.out.println(statement + " = " + result);
    }
}

