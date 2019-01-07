package com.daidao.learn.pattern.observer.example03;

import java.util.Observable;
import java.util.Observer;

public class HousePriceObserver implements Observer {
    private String name;

    public HousePriceObserver(String name){
        this.name = name;
    }


    @Override
    public void update(Observable o, Object arg) {
        if(arg instanceof Float){
            System.out.println(name + "观察到价格更改为：" +  ((Float) arg).floatValue());
        }
    }
}
