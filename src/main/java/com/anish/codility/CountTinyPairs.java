package com.anish.codility;

public class CountTinyPairs {
    public static int countTinyPairs(int []a,int[] b,int n,int k){
        int count=0;
        for(int i=0;i<n;i++){
            if(Integer.parseInt(String.valueOf(a[i]).concat(String.valueOf(b[n-1-i])))<k){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] arg){
       int  a[] = {16, 1, 4, 2, 14};
       int b[] = {7, 11, 2, 0, 15};
       int k = 743;
       System.out.println(countTinyPairs(a,b,a.length,k));
    }
}
