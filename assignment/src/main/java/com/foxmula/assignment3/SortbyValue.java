package com.foxmula.assignment3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Map.Entry;

public class SortbyValue {

    public static void main(String[] args) throws IOException
    {
           
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

           String[] input = br.readLine().split(" ");

           int[] arr = new int[input.length];

           for(int i=0;i<arr.length;i++)
           {
               arr[i] = Integer.parseInt(input[i]);
           }

           SortbyValue s = new SortbyValue();

           s.sort(s.check(arr));
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
     public void sort(HashMap<Integer,Integer> hm)
     {    
         Set<Entry<Integer,Integer>> s = hm.entrySet();

         List<Entry<Integer,Integer>> l = new ArrayList<>(s);

         Collections.sort(l,new Comparator<Entry<Integer,Integer>>(){

            @Override
            public int compare(Map.Entry<Integer,Integer> o1, Map.Entry<Integer,Integer> o2) {
                
                return o1.getValue().compareTo(o2.getValue());
            }
             
         });

         for (Entry<Integer,Integer> entry : l) {
              System.out.println(entry.getKey()+" "+entry.getValue());
         }
     }
}
