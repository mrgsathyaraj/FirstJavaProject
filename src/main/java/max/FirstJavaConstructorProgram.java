//Sending Values as Method arguments

package max;

public class FirstJavaConstructorProgram {

    private int a ;
    private int b;
    private int result;

    public FirstJavaConstructorProgram(int a,int b,String name)
    {
        this.a =a;
        this.b=b;
    }
    public int add()
    {

      result = a+b;
      return result;
    }

    public int sub()
    {

        result = a-b;
        return result;
    }

    public int div()
    {

        result = a/b;
        return result;
    }
}
