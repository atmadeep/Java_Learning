package com.atmadeep.calcEngine;

public abstract  class CalculateBase {
    private double leftval;
    private double rightval;
    private double result;
    private  char opCode='a';

    //Getter Functions
    public double getLeftval(){return leftval;}
    public double getRightval(){return rightval;}
    public char getopCode(){return opCode;}
    public double getResult(){return result;}
    public void setResult(double result) {this.result = result; }

    public CalculateBase(){}
    public CalculateBase(double leftval,double rightval){
        this.leftval=leftval;
        this.rightval=rightval;
    }
    public abstract void calculate() throws Exception;
}
