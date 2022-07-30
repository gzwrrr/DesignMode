package com.gontoy.o_iterator.example;

import java.util.Iterator;
import java.util.List;

/**
 * @author gzw
 */
public class InfoCollegeIterator implements Iterator {

    List<Department> departments;

    int index = -1;

    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    public boolean hasNext() {
        if (index >= departments.size() - 1) {
            return false;
        } else {
            index++;
            return true;
        }
    }

    public Object next() {
        return departments.get(index);
    }

    public void remove() {
        // 默认空实现
    }
}
