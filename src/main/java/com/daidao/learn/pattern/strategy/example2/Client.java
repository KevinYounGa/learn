package com.daidao.learn.pattern.strategy.example2;

import java.math.BigDecimal;
/**
 * 定义：
 * 　　策略模式定义了一系列的算法，并将每一个算法封装起来，使每个算法可以相互替代，使算法本身和使用算法的客户端分割开来，相互独立。
 * 结构：
 * 　　1.策略接口角色IStrategy:用来约束一系列具体的策略算法，策略上下文角色ConcreteStrategy使用此策略接口来调用具体的策略所实现的算法。
 *
 * 　　2.具体策略实现角色ConcreteStrategy:具体的策略实现，即具体的算法实现。
 *
 * 　　3.策略上下文角色StrategyContext:策略上下文，负责和具体的策略实现交互，通常策略上下文对象会持有一个真正的策略实现对象，策略上下文还可以让具体的策略实现从其中获取相关数据，回调策略上下文对象的方法。
 * */
public class Client {
    public static void main(String[] args){
        //创建老客户报价
        IQuoteStrategy iQuoteStrategy = new OldCustomerQuoteStrategy();
        QuoteContext ctx = new QuoteContext(iQuoteStrategy);
        BigDecimal p = ctx.getPrice(new BigDecimal(1000));
        System.out.println("折扣价为：" + p);
    }
}
