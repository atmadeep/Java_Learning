package com.atmadeep.work;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {

base A=new base();
BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
String name = input.readLine();
System.out.println(name);
A.display_num(1,4,2,4,43,23);
    }

}