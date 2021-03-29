package ifelse.numbercheck;

public class Runner {

    public static void main(String[] arg)
    {

        NumberCheck op= new NumberCheck();
        String s = op.CheckNumber(10, 11);
        System.out.println("The entered number is post validation:"+s);

        s = op.CheckNumber(10, 8);
        System.out.println("The entered number is post validation:"+s);

        s = op.CheckNumber(10, 10);
        System.out.println("The entered number is post validation:"+s);


    }
}
