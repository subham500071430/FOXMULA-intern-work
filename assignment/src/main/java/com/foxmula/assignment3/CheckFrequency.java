package com.foxmula.assignment3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CheckFrequency {
      
     public static void main(String[] args) throws IOException
     {
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

           String[] input = br.readLine().split(" ");

           int[] arr = new int[input.length];

           for(int i=0;i<arr.length;i++)
           {
               arr[i] = Integer.parseInt(input[i]);
           }
           
           CheckFrequency f  = new CheckFrequency();
        
           f.display(f.check(arr));

     }
     HashMap<Integer,Integer> check(int[] a)
     {   

        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

        for(int i=0;i<a.length;i++)
        {
            if(hm.containsKey(a[i]))
            {
               hm.put(a[i],hm.get(a[i])+1);
            }
            else
            {
                hm.put(a[i],1);
            }
        }
        return hm;
     }
     public void display(HashMap<Integer,Integer> h)
     {
         for(Map.Entry<Integer,Integer> m :h.entrySet())
         {
             System.out.println((int)m.getKey()+" "+(int)m.getValue());
         }
     }
    
}
