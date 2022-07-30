package com.gontoy.m_command.example;

/**
 * 空命令
 * 不执行任何命令
 * 用于初始化所有按钮
 * 当调用空命令时，对象什么都不做
 * 这也可以理解成一种设计模式，可以省略掉对空的判断
 * @author gzw
 */
public class EmptyCommand implements Command {
    public void execute() {}

    public void undo() {}
}
