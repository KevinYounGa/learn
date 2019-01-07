package com.daidao.learn.pattern.bridge;

public class Square extends Shape {
    @Override
    public void draw() {
        color.print("正方形");
    }
}
