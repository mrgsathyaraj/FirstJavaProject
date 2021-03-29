// attributes and methods
//method param

package com.max;

public class FirstJavaProgram {

    private int result;
    private String name;

    public int add(int a ,int b)
    {

      result = a+b;
      return result;
    }

    public int sub(int a ,int b)
    {

        result = a-b;
        return result;
    }

    public int div(int a ,int b)
    {

        result = a/b;
        return result;
    }

    public String name(String name)
    {
        this.name = name;
        return name;
    }
}
