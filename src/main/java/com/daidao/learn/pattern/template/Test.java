package com.daidao.learn.pattern.template;
/**
 *
 * */
public class Test {

    @org.junit.Test
    public void main(){
        //炒手撕包菜
        ConcreteBaoCai baoCai = new ConcreteBaoCai();
        baoCai.cookProcess();
        System.out.println("----------------------------------------");
        //炒蒜蓉菜心
        ConcreteCaiXin caiXin = new ConcreteCaiXin();
        caiXin.cookProcess();
    }
}
