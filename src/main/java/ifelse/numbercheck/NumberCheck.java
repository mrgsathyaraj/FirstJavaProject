package ifelse.numbercheck;

/*
To check the number is not greater than the constant number
Create an public  Method to validate the number
 */

public class NumberCheck {

   public   String CheckNumber(int ConstantNumber,int MyNumber)
    {

        String result = "";

        if(ConstantNumber<MyNumber)
        {
            result="greater than "+ConstantNumber;
        }
        else if(ConstantNumber>MyNumber)
        {
            result="lower than "+ConstantNumber;
        }
        else if(ConstantNumber==MyNumber)
        {
            result ="equal to " +ConstantNumber;
        }

        return result;
    }
}
