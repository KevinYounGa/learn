package com.daidao.learn.pattern.bridge;

public class Rectangle extends Shape {
    @Override
    public void draw() {
        color.print("长方形");
    }
}
