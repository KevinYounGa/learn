package com.daidao.learn.pattern.memento;


import lombok.Data;

/**
 * 象棋棋子备忘录类：备忘录
 * 存储原发器的内部状态，根据原发器来决定保存哪些内部状态。
 * 备忘录的设计一般可以参考原发器的设计，根据实际需要确定备忘录类中的属性。
 * 需要注意的是，除了原发器本身与负责人类之外，备忘录对象不能直接供其他类使用。
 * */
@Data
public class ChessmanMemento {
    private String label;
    private int x;
    private int y;

    public ChessmanMemento() {
    }

    public ChessmanMemento(String label, int x, int y) {
        this.label = label;
        this.x = x;
        this.y = y;
    }


}
