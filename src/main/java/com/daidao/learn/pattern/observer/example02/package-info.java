package com.daidao.learn.pattern.observer.example02;

/**java.util
 类 Observable

 @see java.lang.Object
 继承者 java.util.Observable
 public class Observable
 extends Object
 此类表示模型视图范例中的 observable 对象，或者说“数据”。可将其子类化，表示应用程序想要观察的对象。
 一个 observable 对象可以有一个或多个观察者。观察者可以是实现了 Observer 接口的任意对象。一个 observable 实例改变后，调用 Observable 的 notifyObservers 方法的应用程序会通过调用观察者的 update 方法来通知观察者该实例发生了改变。
 未指定发送通知的顺序。Observable 类中所提供的默认实现将按照其注册的重要性顺序来通知 Observers，但是子类可能改变此顺序，从而使用非固定顺序在单独的线程上发送通知，或者也可能保证其子类遵从其所选择的顺序。
 注意，此通知机制与线程无关，并且与 Object 类的 wait 和 notify 机制完全独立。
 新创建一个 observable 对象时，其观察者集是空的。当且仅当 equals 方法为两个观察者返回 true 时，才认为它们是相同的。
 从以下版本开始：
 JDK1.0
 另请参见：
 notifyObservers(), notifyObservers(java.lang.Object), Observer, Observer.update(java.util.Observable, java.lang.Object)
 构造方法摘要
 Observable()
 构造一个带有零个观察者的 Observable。

 方法摘要
 void	addObserver(Observer o)
 如果观察者与集合中已有的观察者不同，则向对象的观察者集中添加此观察者。
 protected  void	clearChanged()
 指示对象不再改变，或者它已对其所有的观察者通知了最近的改变，所以 hasChanged 方法将返回 false。
 int	countObservers()
 返回 Observable 对象的观察者数目。
 void	deleteObserver(Observer o)
 从对象的观察者集合中删除某个观察者。
 void	deleteObservers()
 清除观察者列表，使此对象不再有任何观察者。
 boolean	hasChanged()
 测试对象是否改变。
 void	notifyObservers()
 如果 hasChanged 方法指示对象已改变，则通知其所有观察者，并调用 clearChanged 方法来指示此对象不再改变。
 void	notifyObservers(Object arg)
 如果 hasChanged 方法指示对象已改变，则通知其所有观察者，并调用 clearChanged 方法来指示此对象不再改变。
 protected  void	setChanged()
 标记此 Observable 对象为已改变的对象；现在 hasChanged 方法将返回 true。

 从类 java.lang.Object 继承的方法
 clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait

 构造方法详细信息
 Observable
 public Observable()
 构造一个带有零个观察者的 Observable。
 方法详细信息
 addObserver
 public void addObserver(Observer o)
 如果观察者与集合中已有的观察者不同，则向对象的观察者集中添加此观察者。未指定向多个观察者发送通知的顺序。请参阅该类的注释。
 参数：
 o - 要添加的观察者。
 抛出：
 NullPointerException - 如果参数 o 为 null。
 deleteObserver
 public void deleteObserver(Observer o)
 从对象的观察者集合中删除某个观察者。向此方法传递 null 将使其无效。
 参数：
 o - 要删除的观察者。
 notifyObservers
 public void notifyObservers()
 如果 hasChanged 方法指示对象已改变，则通知其所有观察者，并调用 clearChanged 方法来指示此对象不再改变。
 每个观察者都有其 update 方法，其调用参数有两个：observable 对象和 null。换句话说，此方法等效于：
 notifyObservers(null)
 另请参见：
 clearChanged(), hasChanged(), Observer.update(java.util.Observable, java.lang.Object)
 notifyObservers
 public void notifyObservers(Object arg)
 如果 hasChanged 方法指示对象已改变，则通知其所有观察者，并调用 clearChanged 方法来指示此对象不再改变。
 每个观察者都有其 update 方法，其调用参数有两个：observable 对象和 arg 参数。
 参数：
 arg - 任意对象。
 另请参见：
 clearChanged(), hasChanged(), Observer.update(java.util.Observable, java.lang.Object)
 deleteObservers
 public void deleteObservers()
 清除观察者列表，使此对象不再有任何观察者。
 setChanged
 protected void setChanged()
 标记此 Observable 对象为已改变的对象；现在 hasChanged 方法将返回 true。
 clearChanged
 protected void clearChanged()
 指示对象不再改变，或者它已对其所有的观察者通知了最近的改变，所以 hasChanged 方法将返回 false。notifyObservers 方法自动调用此方法。
 另请参见：
 notifyObservers(), notifyObservers(java.lang.Object)
 hasChanged
 public boolean hasChanged()
 测试对象是否改变。
 返回：
 当且仅当在此对象上最近调用了 setChanged 方法，而不是 clearChanged 方法时，才返回 true；否则返回 false。
 另请参见：
 clearChanged(), setChanged()
 countObservers
 public int countObservers()
 返回 Observable 对象的观察者数目。
 返回：
 对象的观察者数目。
 */