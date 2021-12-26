package com.basic.dev.behavioral.chainofresponsibility;

public abstract class LeaveHandler {

    protected LeaveHandler supervisor;

    public void setSuperVisor(LeaveHandler supervisor) {
        this.supervisor = supervisor;
    }

    public abstract String applyLeave(Leave leave);
}
