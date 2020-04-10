package com.anish.codility;

import java.util.HashMap;
import java.util.Map;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        int[] arr = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int rotate = (i + K) % A.length;
            arr[rotate] = A[i];
        }
        return arr;
    }

    public static void main(String[] arg) {
        CyclicRotation cyclicRotation = new CyclicRotation();
        Map<String,String> map=new HashMap<>();
        int a[] = {3, 8, 9, 7, 6};
        int k = 3;
       int arr[]= cyclicRotation.solution(a, k);
        for (int i=0;i<arr.length;i++) {
            System.out.print(" "+arr[i]);

        }
    }
}
