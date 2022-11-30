package com.gontoy.v_responsibility.example.simple.handler;

import com.gontoy.v_responsibility.example.simple.request.Request;

/**
 * @author gzw
 */
public class CollegeApprover extends Approver {

    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(Request request) {
        if (request.getPrice() > 5000 && request.getPrice() <= 10000) {
            System.out.printf("请求编号：%d 被 %s 处理", request.getId(), this.name);
        } else {
            approver.processRequest(request);
        }
    }
}
