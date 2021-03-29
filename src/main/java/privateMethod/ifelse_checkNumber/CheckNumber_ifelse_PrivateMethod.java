package privateMethod.ifelse_checkNumber;

/*
Compare two number and provide the greater number
Use Private method to validate the greater Number
access private method outside the class getter and setter way
 */

public class CheckNumber_ifelse_PrivateMethod
{
    private int constantNumber;
    private int actualNumber;
    String result ="";

    private String checkGreaterNumber(int constantNumber, int actualNumber)
    {
        this.constantNumber=constantNumber;
        this.actualNumber=actualNumber;

        if(actualNumber<constantNumber)
        {
            result = "lesser than "+constantNumber;
        }

        else if(actualNumber>constantNumber)
        {
            result = "greater than "+constantNumber;
        }

        else if(actualNumber==(constantNumber))
        {
            result = "equal to  "+constantNumber;
        }
        return result;
    }

    public String getResult(int constantNumber,int actualNumber)
    {
        String s = checkGreaterNumber(constantNumber,actualNumber);

        return s;

    }


}
