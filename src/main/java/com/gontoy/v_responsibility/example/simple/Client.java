package com.gontoy.v_responsibility.example.simple;

import com.gontoy.v_responsibility.example.simple.handler.CollegeApprover;
import com.gontoy.v_responsibility.example.simple.handler.DepartmentApprover;
import com.gontoy.v_responsibility.example.simple.handler.SchoolMasterApprover;
import com.gontoy.v_responsibility.example.simple.request.Request;

/**
 * @author gzw
 */
public class Client {
    public static void main(String[] args) {
        Request request = new Request(1, 11000, 1);

        DepartmentApprover departmentApprover = new DepartmentApprover("部门主任");
        CollegeApprover collegeApprover = new CollegeApprover("院长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("校长");

        // 设置下一个处理者，这里链接成环是因为审批费用最终肯定会被某人处理，所以一定会有终止的情况
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(departmentApprover);

        // 发出请求
        departmentApprover.processRequest(request);
    }
}
