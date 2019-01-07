package com.daidao.learn.pattern.memento;

import java.util.ArrayList;

/**
 * 象棋棋子备忘录管理类：负责人
 * 负责人又称为管理者，它负责保存备忘录，但是不能对备忘录的内容进行操作或检查。
 * 在负责人类中可以存储一个或多个备忘录对象，它只负责存储对象，而不能修改对象，也无须知道对象的实现细节。
 * */
public class MementoCaretaker {
    //定义一个集合来存储多个备忘录
    private ArrayList mementolist = new ArrayList();

    public ChessmanMemento getMemento(int i) {
        return (ChessmanMemento)mementolist.get(i);
    }

    public void setMemento(ChessmanMemento memento) {
        mementolist.add(memento);
    }
}
