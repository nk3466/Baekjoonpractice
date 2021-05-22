package com.programmer.year2021.month05;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class Result7{

    /*
     * Complete the 'groupSort' function below.
     *
     * The function is expected to return a 2D_INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<List<Integer>> groupSort(List<Integer> arr) {
    // Write your code here
    	int arr1[][] = new int[arr.size()][1];
    	int check = 0;
    	int index1 = 0;
    	List<List<Integer>> list = new ArrayList<>();
    	for(int i = 0; i < arr.size(); i++) {
			if(arr1[i][0] == arr.indexOf(i)) {
				check = 1;
			}
    		if(check == 0) {
    			arr1[index1][0] = i;
    			arr1[index1][1]++;
    			index1++;
    		}else if(check == 1) {
    			for(int j = 0; j <= index1; i++) {
    				if(arr1[j][0] == list.indexOf(i)) {
    					arr1[j][1]++;
    				}
    			}
    		}
    		
    	}
    	
    	return list;
    }

}

public class Result5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<List<Integer>> result = Result7.groupSort(arr);

        result.stream()
            .map(
                r -> r.stream()
                    .map(Object::toString)
                    .collect(joining(" "))
            )
            .map(r -> r + "\n")
            .collect(toList())
            .forEach(e -> {
                try {
                    bufferedWriter.write(e);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
