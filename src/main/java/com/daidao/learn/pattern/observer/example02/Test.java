package com.daidao.learn.pattern.observer.example02;

public class Test {

    @org.junit.Test
    public static void main(String[] arg){
        Publish publish = new Publish();
        Subscribe subscribe = new Subscribe(publish);
        publish.setData("start");
    }
}
