package com.foxmula.assignment2;

import java.util.*;
import java.io.*;

public class FindPair {
    
   public static void main(String[] args) throws IOException{
	   
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    int k = Integer.parseInt(br.readLine());
		
		FindPair obj = new FindPair();
		
		obj.find(obj.add(),k);
		
	}
   public ArrayList<Integer> add() throws IOException{
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        String[] input = br.readLine().split(" ");
       
       for(int i=0;i<input.length;i++) {
       	
       	a.add(Integer.parseInt(input[i]));
       	
       }
       return a;
	}
   public void find(ArrayList<Integer> a , int x) {
		
		
		HashSet<Integer> h = new HashSet<Integer>();
		
		
		for(int i=0;i<a.size();i++) {
		   
			int n = x - a.get(i) ;
			
			if(h.contains(n)) {
				
				System.out.println(n+" "+a.get(i));
				
				h.add(a.get(i));
						
			}else {
				h.add(a.get(i));
			}
		}
		
	}

}
