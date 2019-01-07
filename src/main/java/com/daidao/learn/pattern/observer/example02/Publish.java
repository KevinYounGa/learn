package com.daidao.learn.pattern.observer.example02;

import java.util.Observable;

public class Publish extends Observable {
    private String data = "";
    public String getData(){
        return data;
    }

    public void setData(String data){
        if(!this.data.equals(data)){
            this.data = data;
            //改变通知者的状态
            setChanged();
        }
        //调用父类Observable方法，通知所有观察者
        notifyObservers();
    }

}
