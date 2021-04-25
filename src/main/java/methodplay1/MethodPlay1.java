package methodplay1;

public class MethodPlay1 {

    public MethodPlay1()
    {
        super();
        System.out.println("constructor block no arg");
    }

    public MethodPlay1(String x, String y)
    {

      System.out.println("constructor overload block arg x y"+x+y);

    }

    public void getStatus(int number1, int number2)
    {
        number1 =10;
        number2=20;

        if(number1==10)
        {
            System.out.println("success with method params "+number1+number2);
        }
        else
        {
            System.out.println("just check else loop");
        }

    }

    public void getStatus()
    {
        System.out.println("success without argument");
    }

    public int calc(int a, int b,int c)
    {
        int result =a+b+c;

        return result;

    }

    public int calc(int a, int b)
    {
        int result =a+b;

        return result;

    }
}
