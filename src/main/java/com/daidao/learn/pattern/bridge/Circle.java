package com.daidao.learn.pattern.bridge;

public class Circle extends Shape {
    @Override
    public void draw() {
        color.print("圆形");
    }
}
