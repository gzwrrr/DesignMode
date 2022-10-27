package com.gontoy.v_responsibility.example;

/**
 * @author gzw
 */
public class Client {
    public static void main(String[] args) {
        Request request = new Request(1, 11000, 1);

        DepartmentApprover departmentApprover = new DepartmentApprover("部门主任");
        CollegeApprover collegeApprover = new CollegeApprover("院长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("校长");

        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(departmentApprover);

        departmentApprover.processRequest(request);
    }
}
