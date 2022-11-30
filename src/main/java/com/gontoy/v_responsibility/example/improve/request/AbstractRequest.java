package com.gontoy.v_responsibility.example.improve.request;

public abstract class AbstractRequest {

    private Object object;

    public AbstractRequest(Object object){
        this.object = object;
    }

    public Object getContent(){
        return object;
    }

    public abstract int getRequestLevel();
}

