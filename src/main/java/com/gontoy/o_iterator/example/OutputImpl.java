package com.gontoy.o_iterator.example;

import java.util.Iterator;
import java.util.List;

/**
 * @author gzw
 */
public class OutputImpl {
    List<College> collegeList;

    public OutputImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    public void printDepartment(Iterator iterator) {
        while (iterator.hasNext()) {
            Department department = (Department) iterator.next();
            System.out.println(department.getName());
        }
    }

    public void printCollege() {
        Iterator<College> iterator = collegeList.iterator();

        while (iterator.hasNext()) {
            College college = iterator.next();
            System.out.printf("======== %s ========\n", college.getName());
            printDepartment(college.createIterator());
        }
    }
}
