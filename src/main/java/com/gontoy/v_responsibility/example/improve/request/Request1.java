package com.gontoy.v_responsibility.example.improve.request;

public class Request1 extends AbstractRequest {

    @Override
    public int getRequestLevel() {
        return 1;
    }

    public Request1(Object object) {
        super(object);
    }

    @Override
    public Object getContent() {
        return super.getContent();
    }
}