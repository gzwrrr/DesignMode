package com.gontoy.m_command.example;

/**
 * @author gzw
 */
public interface Command {
    /**
     * 执行命令
     */
    public void execute();


    /**
     * 撤销命令
     */
    public void undo();
}
