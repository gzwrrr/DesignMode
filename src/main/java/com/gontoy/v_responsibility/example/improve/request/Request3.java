package com.gontoy.v_responsibility.example.improve.request;

public class Request3 extends AbstractRequest {

    @Override
    public int getRequestLevel() {
        return 3;
    }

    public Request3(Object object) {
        super(object);
    }

    @Override
    public Object getContent() {
        return super.getContent();
    }
}