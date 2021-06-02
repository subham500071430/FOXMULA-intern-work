package assignment2;

import java.util.*;
import java.io.*;

public class TraverseHashSet {
 
	
   public static void main(String[] args) throws IOException{
   
	
	TraverseHashSet t = new TraverseHashSet();
	
	t.traverse(t.add());
	
   }
	
	
   private HashSet<Integer> add() throws IOException{
		
		HashSet<Integer> h = new HashSet<Integer>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        String[] input = br.readLine().split(" ");
       
       for(int i=0;i<input.length;i++) {
       	
       	h.add(Integer.parseInt(input[i]));
       	
       }
       return h;
	 }

     private void traverse(HashSet<Integer> h) {
	
	
	 for(Integer i : h) 
	 {
		 System.out.println(i);
	 }
	 
  }	 
}
