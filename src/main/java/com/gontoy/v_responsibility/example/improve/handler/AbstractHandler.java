package com.gontoy.v_responsibility.example.improve.handler;

import com.gontoy.v_responsibility.example.improve.request.AbstractRequest;

public abstract class AbstractHandler {

    protected static final String TAG = AbstractHandler.class.getSimpleName();

    public AbstractHandler nextHandler;

    public final void handleRequest(AbstractRequest request){
        if(getHandleLevel() == request.getRequestLevel()){
            handle(request);
        }else{
            if(nextHandler != null){
                nextHandler.handle(request);
            }else{
                //当所有处理者对象均不能处理该请求时输出
                System.out.println(TAG + " All of handler can not handle the request");
            }
        }
    }

    protected abstract int getHandleLevel();

    protected abstract void handle(AbstractRequest request);
}

