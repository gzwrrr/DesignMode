package com.gontoy.o_iterator.example;

import java.util.Iterator;

/**
 * @author gzw
 */
public class ComputerCollegeIterator implements Iterator {
    /**
     * 需要知道 department 是怎么存放的
     */
    Department[] departments;

    /**
     * 遍历额位置
     */
    int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    public Object next() {
        Department department = departments[position];
        position++;
        return department;
    }

    public void remove() {
        // 删除的方法默认空实现
    }
}
