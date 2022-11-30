package com.gontoy.v_responsibility.example.improve.handler;

import com.gontoy.v_responsibility.example.improve.request.AbstractRequest;

public class Handler3 extends AbstractHandler {

    @Override
    protected int getHandleLevel() {
        return 3;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println(TAG + " handler request:"+request.getRequestLevel());
    }
}