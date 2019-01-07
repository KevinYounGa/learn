package com.daidao.learn.pattern.template;

/**
 * 炒蒜蓉菜心的类
 * */
public class ConcreteCaiXin extends Template{
    @Override
    public void  pourVegetable(){
        System.out.println("下锅的蔬菜是菜心");
    }
    @Override
    public void  pourSauce(){
        System.out.println("下锅的酱料是蒜蓉");
    }

}
