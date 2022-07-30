package com.gontoy.o_iterator.example;

import java.util.ArrayList;

/**
 * @author gzw
 */
public class Client {
    public static void main(String[] args) {
        ArrayList<College> collegeArrayList = new ArrayList<College>();

        ComputerCollege computerCollege = new ComputerCollege();

        InfoCollege infoCollege = new InfoCollege();

        collegeArrayList.add(computerCollege);
        collegeArrayList.add(infoCollege);

        OutputImpl output = new OutputImpl(collegeArrayList);
        output.printCollege();
    }
}
