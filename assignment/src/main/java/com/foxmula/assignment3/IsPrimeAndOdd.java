package com.foxmula.assignment3;

import java.util.*;
import java.io.*;

public class IsPrimeAndOdd {
     

    public static void main(String[] args) throws IOException
    {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        IsPrimeAndOdd i = new IsPrimeAndOdd();
        
        try{
           
            if(i.check(num))
        {
            throw new CustomException("Number is Invalid");
        }
        }
        catch(CustomException e)
        {
            System.out.println(e);
        }


    }
    public boolean check(int a)
    {
           boolean prime = true;

           for(int i=2;i<=(int)Math.sqrt(a);i++)
           {
                if(a%i==0)
                {
                    prime = false;

                    break;
                }
           }
               
            if(prime&&a%2!=0)
            { 
               
               return true;
            }
           
            return false;
    }
     
}
class CustomException extends Exception{
    public CustomException(String s)
    {
        super(s);
    }
}
