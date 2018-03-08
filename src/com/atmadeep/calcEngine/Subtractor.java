package com.atmadeep.calcEngine;

public class Subtractor extends CalculateBase{

    public Subtractor(){}
    public Subtractor(double leftval,double rightval){
        super(leftval,rightval);
    }

    @Override
    public void calculate(){
        double value = getLeftval() - getRightval();
        setResult(value);
    }
}
