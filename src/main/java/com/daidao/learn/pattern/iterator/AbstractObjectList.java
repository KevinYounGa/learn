package com.daidao.learn.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象聚合类
 */
public abstract class AbstractObjectList {
    List<Object> objects = new ArrayList<>();

    public AbstractObjectList(List<Object> objects) {
        this.objects = objects;
    }

    public void addObject(Object o){
        this.objects.add(o);
    }

    public void removeObject(Object o){
        this.objects.remove(o);
    }

    public List<Object> getObjects(){
        return this.objects;
    }

    /**声明创建迭代器对象的抽象工厂方法*/
    public abstract AbstractIterator createIterator();
}
