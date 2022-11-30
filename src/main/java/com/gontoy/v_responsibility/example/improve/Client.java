package com.gontoy.v_responsibility.example.improve;

import com.gontoy.v_responsibility.example.improve.handler.AbstractHandler;
import com.gontoy.v_responsibility.example.improve.handler.Handler1;
import com.gontoy.v_responsibility.example.improve.handler.Handler2;
import com.gontoy.v_responsibility.example.improve.handler.Handler3;
import com.gontoy.v_responsibility.example.improve.request.AbstractRequest;
import com.gontoy.v_responsibility.example.improve.request.Request1;
import com.gontoy.v_responsibility.example.improve.request.Request2;
import com.gontoy.v_responsibility.example.improve.request.Request3;

public class Client {

    public static void main(String[] args) {
        AbstractHandler handler1 = new Handler1();
        AbstractHandler handler2 = new Handler2();
        AbstractHandler handler3 = new Handler3();

        handler1.nextHandler = handler2;
        handler2.nextHandler = handler3;

        //构造三个请求者对象
        AbstractRequest request1 = new Request1("Request1");
        AbstractRequest request2 = new Request2("Request2");
        AbstractRequest request3 = new Request3("Request3");

        //总是从链式的首端发起请求
        handler1.handleRequest(request1);
        handler1.handleRequest(request2);
        handler1.handleRequest(request3);
    }
}
