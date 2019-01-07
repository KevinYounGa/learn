package com.daidao.learn.pattern.bridge;

public class White implements Color {
    @Override
    public void print(String shape) {
        System.out.println("白色的" + shape);
    }
}
