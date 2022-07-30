package com.gontoy.n_visitor.example;

/**
 * 使用了双分派
 * 即首先在客户端程序中将具体状态作为参数传递到 Man 中（第一次分派）
 * 之后 Man 中又将自己（this）作为参数继续传递
 * @author gzw
 */
public class Man extends People {

    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
