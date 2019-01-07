package com.daidao.learn.pattern.bridge;

public class Gray implements Color {
    @Override
    public void print(String shape) {
        System.out.println("灰色的" + shape);
    }
}
