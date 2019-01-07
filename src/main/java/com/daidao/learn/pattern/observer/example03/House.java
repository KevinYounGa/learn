package com.daidao.learn.pattern.observer.example03;

import java.util.Observable;

public class House extends Observable {
    private float price;
    public House(float price){
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        super.setChanged();
        super.notifyObservers(price);
        this.price = price;
    }

    @Override
    public String toString() {
        return "House{" +
                "price=" + price +
                '}';
    }
}
