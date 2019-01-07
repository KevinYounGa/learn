package com.daidao.learn.pattern.observer.example01;

import java.util.ArrayList;
import java.util.List;

public class WechatObserver implements Observerable {
    private List<Observer> observers;

    private String msg;

    public WechatObserver() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (!observers.isEmpty()) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        for(Observer o:observers){
            o.update(msg);
        }
    }

    public void setInfomation(String s) {
        this.msg = s;
        System.out.println("微信服务更新消息： " + s);
        //消息更新，通知所有观察者
        notifyObserver();
    }
}
