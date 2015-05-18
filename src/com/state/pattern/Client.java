package com.state.pattern;
public class Client {

    public static void main(String[] args){
        //创建状态
        State state = new ConcreteStateB();
        State state2 = new ConcreteStateA();
        //创建环境
        Context context = new Context();
        //将状态设置到环境中
        context.setState(state2);
        //请求
        context.request("test");
    }
}