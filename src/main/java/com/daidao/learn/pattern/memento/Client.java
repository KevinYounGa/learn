package com.daidao.learn.pattern.memento;

import org.junit.Test;
/**
 * 备忘录是一个很特殊的对象，只有原发器对它拥有控制的权力，负责人只负责管理，而其他类无法访问到备忘录，因此我们需要对备忘录进行封装。
 * */
public class Client {
    private static int index = -1; //定义一个索引来记录当前状态所在位置
    private static MementoCaretaker mc = new MementoCaretaker();

    @Test
    public void main() {

        //只支持上次备忘
       /* MementoCaretaker caretaker = new MementoCaretaker();
        Chessman chessman = new Chessman("车",1,1);
        display(chessman);
        //保存状态
        caretaker.setMemento(chessman.save());
        chessman.setY(4);
        System.out.println("---------------一回合----------------");
        display(chessman);
        //保存状态
        caretaker.setMemento(chessman.save());
        display(chessman);
        chessman.setX(5);
        System.out.println("---------------一回合----------------");
        display(chessman);
        System.out.println("******悔棋******");
        //恢复状态
        chessman.restore(caretaker.getMemento());
        display(chessman);*/


       //支持多次备忘
        Chessman chess = new Chessman("车",1,1);
        play(chess);
        chess.setY(4);
        play(chess);
        chess.setX(5);
        play(chess);
        undo(chess,index);
        undo(chess,index);
        redo(chess,index);
        redo(chess,index);
    }

    public static void display(Chessman chess) {
        System.out.println("棋子" + chess.getLabel() + "当前位置为：" + "第" + chess.getX() + "行" + "第" + chess.getY() + "列。");
    }

    //下棋
    public static void play(Chessman chess) {
        mc.setMemento(chess.save()); //保存备忘录
        index++;
        System.out.println("棋子" + chess.getLabel() + "当前位置为：" + "第" + chess.getX() + "行" + "第" + chess.getY() + "列。");
    }

    //悔棋
    public static void undo(Chessman chess, int i) {
        System.out.println("******悔棋******");
        index--;
        chess.restore(mc.getMemento(i - 1)); //撤销到上一个备忘录
        System.out.println("棋子" + chess.getLabel() + "当前位置为：" + "第" + chess.getX() + "行" + "第" + chess.getY() + "列。");
    }

    //撤销悔棋
    public static void redo(Chessman chess, int i) {
        System.out.println("******撤销悔棋******");
        index++;
        chess.restore(mc.getMemento(i + 1)); //恢复到下一个备忘录
        System.out.println("棋子" + chess.getLabel() + "当前位置为：" + "第" + chess.getX() + "行" + "第" + chess.getY() + "列。");
    }
}
