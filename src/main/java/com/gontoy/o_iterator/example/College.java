package com.gontoy.o_iterator.example;

import java.util.Iterator;

/**
 * @author gzw
 */
public interface College {
    public String getName();

    public void addDepartment(String name, String desc);

    public Iterator createIterator();
}
