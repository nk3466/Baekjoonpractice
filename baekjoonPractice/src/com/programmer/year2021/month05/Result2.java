package com.programmer.year2021.month05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.stream.Collectors;
	
	class Solution{
		
	public static long findRange(int num) {

		
		int arr[] = new int[ (int)(Math.log10(num)+1)];		//정수의 길이로 배열의 크기 지정
		String num2 = num + "";
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = num2.charAt(i) - 48;
		}
		
	        long max;
	        long min;
	        
	        /* 최댓값 찾기 */
	        int first = 0;
	        for(int i = arr.length-1; i >= 0; i--) {
	        	if(arr[i] != 9 ) {
	        		first = arr[i];
	        	}
	        }
	        
	        for(int i = 0; i < arr.length; i++) {
	        	if(arr[i] == first) {
	        		arr[i] = 9;
	        	}
	        }
	        
	        max = Long.parseLong(Arrays.stream(arr)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining()));
	        
	        System.out.println("max : " + max);
	        
	        /* 배열원위치 */
	        for(int i = 0; i < arr.length; i++) {
				arr[i] = num2.charAt(i) - 48;
			}
	        /* 최솟값 찾기 */
	        int second = 0;
	        for(int i = arr.length-1; i >= 0; i--) {
	        	if(arr[i] != 1) {
	        		second = arr[i];
	        	}
	        }
	        System.out.println(second);
	        System.out.println("0" + arr[0]);
	        System.out.println("1" +arr[1]);
	        System.out.println("2" +arr[2]);
	        for(int i = 0; i < arr.length; i++) {
	        	if(second == arr[0] && arr[i] == second) {
	        		arr[i] = 1;
	        		System.out.println(i +"::" + arr[i]);
	        	}else if(arr[i] == second && arr[0] != second) {
	        		arr[i] = 0;
	        		System.out.println(i +":: "  + arr[i]);
	        	}
	        }
	        min = Long.parseLong(Arrays.stream(arr)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining()));
	        System.out.println("min " + min);
	        /*차이*/
	        long result = max - min;
	        
	        return result;
	    }

	}

public class Result2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(bufferedReader.readLine().trim());

        long result = Solution.findRange(num);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
