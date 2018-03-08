package com.atmadeep.calcEngine;

public class MathEquation {
    //Values

    private double leftval;
    private double rightval;
    private double result;
    private  char opCode='a';

    //Getter Functions
    public double getLeftval(){return leftval;}
    public double getRightval(){return rightval;}
    public char getopCode(){return opCode;}
    public double getResult(){return result;}


//Setter Functions
    public void setLeftval(double leftval){this.leftval=leftval;}
    public void setRightval(double rightval){this.rightval=rightval;}
    public void setOpCode(char opCode){this.opCode=opCode;}
    public void setResult(double result) {this.result = result; }

    public MathEquation(){}
 public MathEquation(char opCode){this.opCode=opCode;}
 public MathEquation(double leftval,double rightval,char opCode){
        this(opCode);
        this.leftval=leftval;
        this.rightval=rightval;
 }

    public void execute(){
        switch (opCode) {
            case 'a':
                result = leftval + rightval;
                break;
            case 's':
                result = leftval - rightval;
                break;
            case 'd':
                result = rightval != 0 ? leftval / rightval : 0.0d;
                break;
            case 'm':
                result = leftval * rightval;
                break;
            default:
                System.out.println("invalid-opcode");
                result = 0.0f;
                break;
        }
    }
    public void execute(double leftval,double rightval){
        this.leftval=leftval;
        this.rightval=rightval;
        this.execute();
    }
    public void execute(int leftval,int rightval){
        this.leftval=leftval;
        this.rightval=rightval;
        this.execute();
        result=(int)result;
    }

}
