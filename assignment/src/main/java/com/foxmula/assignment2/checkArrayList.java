package com.foxmula.assignment2;

import java.util.*;
import java.io.*;

public class checkArrayList {
	
           
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int el = Integer.parseInt(br.readLine());
		
		checkArrayList obj = new checkArrayList();
		
		boolean contains = obj.check(obj.add(),el);
		
		if(contains) {
			System.out.println("Element is present");
		}
		else {
			System.out.println("Element is not present");
		}
	}
	public boolean check(ArrayList<Integer> a , int k) {
		
		for(int i=0;i<a.size();i++) {
			if(a.get(i)==k) {
				return true;
			}
		}
		
		return false;
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
}
