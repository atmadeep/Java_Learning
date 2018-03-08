package com.atmadeep.calcEngine;

public class CalcEngine {


    public static void main(String[] args) throws Exception {

        CalculateBase[] calculators = {
                new Adder(23.0d, 45.0d),
        new Subtractor(100, 50),
        new Divider(50, 2),
        new Multiplier(2, 6)
    };
        for (CalculateBase var:calculators
             ) {
            var.calculate();
            System.out.println("Result = " + var.getResult());
        }
    }
}