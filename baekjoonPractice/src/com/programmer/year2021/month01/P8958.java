package com.programmer.year2021.month01;

import java.util.Scanner;

public class P8958{
	 public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
	        
	        int a =sc.nextInt();
	        sc.nextLine();
	        
	       String[] q = new String[a];
	        
	  
	        
		  for(int i = 0; i < a; i++) {
			  q[i] = sc.nextLine();
			  
			  	int count =0;
		        int sum = 0;
			      for(int j = 0; j < q[i].length(); j++) {
			    	  if(q[i].charAt(j)=='X') {
			    		  count = 0;
			    	  }else {
			    		  count++;
			    		  sum += count;
			    	  }
			      }
			      System.out.println(sum);
			      
		  }
	 			}		
        
		 }
