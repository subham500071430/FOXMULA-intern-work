package com.foxmula.assignment2;

import java.io.*;
import java.util.*;


public class SetContains {
     
	
	public static void main(String[] args) throws IOException
	{
		
		
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		
		int element = Integer.parseInt(br.readLine());
		
		SetContains s = new SetContains();
		
		boolean flag = s.traverse(s.add(),element);
		
		System.out.println(flag);
	}
	
	
   public HashSet<Integer> add() throws IOException{
		
		HashSet<Integer> h = new HashSet<Integer>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        String[] input = br.readLine().split(" ");
       
       for(int i=0;i<input.length;i++) {
       	
       	h.add(Integer.parseInt(input[i]));
       	
       }
       return h;
	}
	
	public boolean traverse(HashSet<Integer> h,int x) {
		
		 boolean flag =   false;
		
		 for(Integer i : h) 
		 {
			 if(i==x) {
				 
				 flag = true;
				 break;
			 }
		 }
		 return flag;
	}
}
