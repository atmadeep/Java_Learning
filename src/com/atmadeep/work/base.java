package com.atmadeep.work;

public class base {
    public void display_num(int ... a ){
        if (a.length==0){
            throw new IllegalArgumentException("no values supplied");

       }

        for (int var:a
             ) {
            System.out.println(var);
        }
    }

}
