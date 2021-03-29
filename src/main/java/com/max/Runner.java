package com.max;

public class Runner {

    public static void main(String args[])
    {
        FirstJavaProgram calc = new FirstJavaProgram();
        int result = calc.add(10, 10);
        System.out.println("the addition result is :"+result);

        result = calc.sub(10,10);
        System.out.println("the subtraction result is :"+result);


        result = calc.div(10,10);
        System.out.println("the division result is :"+result);


        String name = calc.name("testname");
        System.out.println("the name is "+name);
    }
}
