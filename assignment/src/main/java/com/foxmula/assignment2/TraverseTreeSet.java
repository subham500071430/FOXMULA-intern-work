package assignment2;

import java.io.*;
import java.util.*;

public class TraverseTreeSet {
    
	
	public static void main(String[] args) throws IOException
	{
		
		TraverseTreeSet t = new TraverseTreeSet();
		
		t.traverse(t.add());
	}
		
		
	private TreeSet<Integer> add() throws IOException{
			
			TreeSet<Integer> h = new TreeSet<Integer>();
			
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
	        String[] input = br.readLine().split(" ");
	       
	       for(int i=0;i<input.length;i++) {
	       	
	       	h.add(Integer.parseInt(input[i]));
	       	
	       }
	       return h;
		}

	private void traverse(TreeSet<Integer> h) {
		
		
		 for(Integer i : h) 
		 {
			 System.out.println(i);
		 }
	}
}
