package com.daidao.learn.pattern.bridge;

public class Red implements Color{
    @Override
    public void print(String shape) {
        System.out.println("红色的" + shape);
    }
}
