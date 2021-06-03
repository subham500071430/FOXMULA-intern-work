package com.foxmula.assignment2;

import java.util.*;
import java.io.*;

public class Occurence {
    
	
public static void main(String[] args) throws IOException{
		
		Occurence obj = new Occurence();
		
		obj.display(obj.checkOccur(obj.add()));
		
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
public HashMap<Integer,Integer> checkOccur(ArrayList<Integer> a) throws IOException{
	
	HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	
    for(int i=0;i<a.size();i++) {
    	
       if(hm.containsKey(a.get(i))) {
    	   
    	   hm.put(a.get(i),hm.get(a.get(i))+1);
       }
       else {
    	   
    	   hm.put(a.get(i),1);
       }
 
    }
    return hm;
}
public void display(HashMap<Integer,Integer> h) {
	
	 for(Map.Entry<Integer,Integer> el : h.entrySet()) {
		 
		 System.out.println(el.getKey()+" occured "+ el.getValue() +" times");
		 
	 }
}
}
