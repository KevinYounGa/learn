package com.daidao.learn.pattern.observer.example03;

public class Test {

    @org.junit.Test
    public void main(){
        House house = new House(1000000);
        HousePriceObserver bobo = new HousePriceObserver("bobo");
        HousePriceObserver momo = new HousePriceObserver("momo");
        HousePriceObserver titi = new HousePriceObserver("titi");
        house.addObserver(bobo);
        house.addObserver(momo);
        house.addObserver(titi);
        house.setPrice(9000000);

    }
}
