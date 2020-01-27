package com.org.ish;

public class QuickShort {
    private static int partition(int[] arr, int low, int high) {
        int pivot=arr[high];
        int i=(low-1);
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }

    private static void quickShort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickShort(arr, low, pi - 1);
            quickShort(arr, pi + 1, high);
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String[] arg) {
        int arr[] = {5, 6, 7, 3, 9, 4, 8};
        quickShort(arr, 0, arr.length - 1);
        printArray(arr);
    }


}