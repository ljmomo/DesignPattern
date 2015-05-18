package com.observer.pattern;
/*
 *  抽象观察者角色（Observer）：为那些在目标发生改变时需要
 *  获得通知的对象定义一个更新接口。
 *  抽象观察者角色主要由抽象类或者接口来实现。
 */
public interface Observer {
    public void update (NumberGenerator generator);
}
