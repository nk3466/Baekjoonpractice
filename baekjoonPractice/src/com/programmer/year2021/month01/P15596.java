package com.programmer.year2021.month01;

public class P15596 {
    long sum(int[] a) {
        long ans = 0;
        for(int i=0;i<a.length;i++){
            ans+=a[i];
        }
        return ans;
    }
}