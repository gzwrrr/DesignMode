package com.gontoy.o_iterator.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author gzw
 */
public class InfoCollege implements College {
    List<Department> departments;

    public InfoCollege() {
        this.departments = new ArrayList<Department>();
        addDepartment("信息学院1", "信息学院1");
        addDepartment("信息学院2", "信息学院2");
    }

    public String getName() {
        return "信息工程学院";
    }

    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments.add(department);
    }

    public Iterator createIterator() {
        return new InfoCollegeIterator(departments);
    }
}
