package com.atmadeep.calcEngine;

import com.sun.jdi.Value;

public class Divider extends CalculateBase {

    public Divider() {
    }

    public Divider(double leftval, double rightval) {
        super(leftval, rightval);
    }

    @Override
    public void calculate() throws Exception {
        if (getRightval() != 0) {
            setResult(getLeftval() / getRightval());
        }
        else
            throw new Exception("Zero value passed");
    }
}
