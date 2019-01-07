package com.daidao.learn.pattern.proxy.staticproxy;

/**
 * 静态代理
 * */
public class StaticProxyTest {
    public static void main(String[] args) {
        BuyHouse buyHouse = new BuyHouseImpl();
        buyHouse.buyHouse();
        ProxyBuyHouse buyHouseProxy = new ProxyBuyHouse(buyHouse);
        buyHouseProxy.buyHouse();
    }
}
