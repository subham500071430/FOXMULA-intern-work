package com.foxmula.assignment3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsPrimeAndOdd {
     

    public static void main(String[] args) throws IOException
    {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        IsPrimeAndOdd i = new IsPrimeAndOdd();

        i.check(num);

    }
    public void check(int a)
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
           try
           {
                 
            if(prime&&a%2!=0)
            { 
               throw new Exception("Number is Invalid");
            }

           }
           catch(Exception e)
           {
                System.out.println(e);
           }

    }
     
}
