package com.Stackroute.pe2;

public class Factorial {
    public String printIntFactorial(int n)
    {
        String number=Integer.toString(n);
        String result="";
        int fact=1;
        for(int i=1;i<n;i++)
        {
            fact=fact*i;
        }
        return Integer.toString(fact);
    }
}
