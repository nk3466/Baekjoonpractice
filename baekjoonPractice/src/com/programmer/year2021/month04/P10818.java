package com.programmer.year2021.month04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class P10818 {

	 public static void main(String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int n = Integer.parseInt(br.readLine());
	        StringTokenizer st = null;
	        Stack<Integer> stack = new Stack<>();

	        for(int i=0; i<n; i++){
	            st = new StringTokenizer(br.readLine(), " ");
	            switch(st.nextToken()){
	                case "push":
	                    stack.push(Integer.parseInt(st.nextToken()));
	                    break;
	                case "pop":
	                    if(!stack.isEmpty())
	                        System.out.println(stack.pop());
	                    else
	                        System.out.println(-1);
	                    break;
	                case "size":
	                    System.out.println(stack.size());
	                    break;
	                case "empty":
	                    if(!stack.isEmpty())
	                        System.out.println(0);
	                    else
	                        System.out.println(1);
	                    break;
	                case "top":
	                    if(!stack.isEmpty())
	                        System.out.println(stack.peek());
	                    else
	                        System.out.println(-1);
	                    break;
	            }
	        }
	    }
	}


