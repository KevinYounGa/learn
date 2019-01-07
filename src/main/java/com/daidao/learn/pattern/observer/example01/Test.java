package com.daidao.learn.pattern.observer.example01;

public class Test {

    @org.junit.Test
    public static void main(String[] args){
        WechatObserver server = new WechatObserver();

        Observer userZhang = new User("ZhangSan");
        Observer userLi = new User("LiSi");
        Observer userWang = new User("WangWu");

        server.registerObserver(userLi);
        server.registerObserver(userWang);
        server.registerObserver(userZhang);

        server.setInfomation("PHP是世界上最好用的语言！");

        System.out.println("----------------------------------------------");
        server.removeObserver(userZhang);
        server.setInfomation("JAVA是世界上最好用的语言！");

    }
}
