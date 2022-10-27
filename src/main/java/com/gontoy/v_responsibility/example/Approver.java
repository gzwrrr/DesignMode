package com.gontoy.v_responsibility.example;

/**
 * @author gzw
 */
public abstract class Approver {
    Approver approver;
    String name;

    public Approver(String name) {
        this.name = name;
    }

    /**
     * 下个处理者
     * @param approver
     */
    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void processRequest(Request request);
}
