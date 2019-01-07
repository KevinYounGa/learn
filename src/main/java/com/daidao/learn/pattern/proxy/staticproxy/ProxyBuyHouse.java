package com.daidao.learn.pattern.proxy.staticproxy;

public class ProxyBuyHouse implements BuyHouse {
    private BuyHouse buyHouse;

    public ProxyBuyHouse(final BuyHouse buyHouse){
        this.buyHouse = buyHouse;
    }
    @Override
    public void buyHouse() {
        System.out.println("买房前准备。。。");
        buyHouse.buyHouse();
        System.out.println("买房后装修。。。");
    }
}
