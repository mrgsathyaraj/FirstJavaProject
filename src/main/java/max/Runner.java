package max;

public class Runner {

    public static void main(String[] arg)
    {
        int result ;
        FirstJavaConstructorProgram calc = new FirstJavaConstructorProgram(20,20,"test");
        result = calc.add();
        System.out.println("the addition is :"+result);
        result = calc.sub();
        System.out.println("the addition is :"+result);
        result = calc.div();
        System.out.println("the addition is :"+result);


    }
}
