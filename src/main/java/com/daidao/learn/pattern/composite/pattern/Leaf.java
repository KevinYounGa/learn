package com.daidao.learn.pattern.composite.pattern;

public class Leaf extends Component {
    private String name = "";

    public Leaf(String name){
        this.name = name;
    }

    @Override
    public void printStruct(String preStr) {
        System.out.println(preStr+"-"+name);
    }
}
