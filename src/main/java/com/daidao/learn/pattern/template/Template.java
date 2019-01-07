package com.daidao.learn.pattern.template;

public abstract class Template {
    //模板方法，用来控制炒菜的流程 （炒菜的流程是一样的-复用）
    //申明为final，不希望子类覆盖这个方法，防止更改流程的执行顺序
    final void cookProcess() {
        //1.倒油
        this.pourOil();
        //2.热油
        this.heatOil();
        //3.倒蔬菜
        this.pourVegetable();
        //4.倒倒调味料
        this.pourSauce();
        //5.翻炒
        this.fry();
    }

    //第一步：倒油是一样的，所以直接实现
    void pourOil() {
        System.out.println("倒油");
    }

    //第二步：热油是一样的，所以直接实现
    void heatOil() {
        System.out.println("热油");
    }

    //第三步：倒蔬菜是不一样的（一个下包菜，一个是下菜心）
    //所以声明为抽象方法，具体由子类实现
    abstract void pourVegetable();

    //第四步：倒调味料是不一样的（一个下辣椒，一个是下蒜蓉）
    //所以声明为抽象方法，具体由子类实现
    abstract void pourSauce();

    //第五步：翻炒是一样的，所以直接实现
    void fry() {
        System.out.println("炒啊炒啊炒到熟啊");
    }
}
