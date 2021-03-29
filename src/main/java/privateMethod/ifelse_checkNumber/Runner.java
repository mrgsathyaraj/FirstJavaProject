package privateMethod.ifelse_checkNumber;

public class Runner {

    public static void main(String[] arg)
    {
        CheckNumber_ifelse_PrivateMethod resultObj= new CheckNumber_ifelse_PrivateMethod();
        String result = resultObj.getResult(10,10);
        System.out.println("The result post validation is " +result);

        result = resultObj.getResult(10,11);
        System.out.println("The result post validation is " +result);

        result = resultObj.getResult(10,8);
        System.out.println("The result post validation is " +result);

    }

}
