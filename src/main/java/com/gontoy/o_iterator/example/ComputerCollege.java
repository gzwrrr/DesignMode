package com.gontoy.o_iterator.example;

import java.util.Iterator;

/**
 * @author gzw
 */
public class ComputerCollege implements College {

    Department[] departments;

    /**
     * 保存当前对象数据的对象个数
     */
    int numOfDepartment = 0;


    public ComputerCollege() {
        this.departments = new Department[5];
        addDepartment("软件工程", "软件工程");
        addDepartment("人工智能", "人工智能");
        addDepartment("数字媒体", "数字媒体");
        addDepartment("信息安全", "信息安全");
        addDepartment("计算机科学与技术", "计算机科学与技术");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment++;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
