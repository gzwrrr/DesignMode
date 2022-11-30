package com.gontoy.v_responsibility.example.improve.request;

public class Request2 extends AbstractRequest {

    @Override
    public int getRequestLevel() {
        return 2;
    }

    public Request2(Object object) {
        super(object);
    }

    @Override
    public Object getContent() {
        return super.getContent();
    }
}