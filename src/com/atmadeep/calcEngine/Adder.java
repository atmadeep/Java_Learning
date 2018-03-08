package com.atmadeep.calcEngine;

public class Adder extends CalculateBase{

    public Adder(){}
    public Adder(double leftval,double rightval){
        super(leftval,rightval);
    }

    @Override
    public void calculate(){
        double value = getLeftval() + getRightval();
        setResult(value);
    }
}
