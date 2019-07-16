package com.Stackroute.pe2;

public class EvenNumber {
    public static boolean isEven(int number)
    {
        if(number==0)
        {
            return true;
        }
        else {
            if (number % 2 == 0)
                return true;
            else if (number % 2 != 0)
                return false;
        }
        return false;

    }

}
