package com.daidao.learn.pattern.template;


/**
 * 炒手撕包菜的类
 * */
public class ConcreteBaoCai extends Template {
    @Override
    public void  pourVegetable(){
        System.out.println("下锅的蔬菜是包菜");
    }
    @Override
    public void  pourSauce(){
        System.out.println("下锅的酱料是辣椒");
    }
}
