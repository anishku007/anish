package com.anish.geeksForGeeks;

public class PrintAllPermutationOfString {

    public static void printAllPermutation(String str, int l, int n) {
        if (l == n) {
            System.out.println(str);
        } else {
            for (int i = l; i <= n; i++) {
                str = swap(str, l, i);
                printAllPermutation(str, l + 1, n);
                str = swap(str, l, i);
            }
        }
    }

    private static String swap(String str, int i, int j) {
        char temp;
        char a[] = str.toCharArray();
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return String.valueOf(a);
    }

    public static void main(String arg[]) {
        String s = "ABC";
        int n = s.length();
        printAllPermutation(s, 0, n - 1);
    }
}
