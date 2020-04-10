package com.anish.geeksForGeeks;

public class CheckNoIsProductOfTwoPrimeno {
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static boolean isPossible(int number) {
        boolean flag = false;
        for (int i = 2; i <= number / 2; ++i) {
            if (isPrime(i)) {
                if (isPrime(number - i)) {
                    System.out.printf("%d = %d + %d\n", number*4, i, number - i);
                    flag = true;
                }
            }
        }
        if (!flag)
            System.out.println(number + " cannot be expressed as the sum of two prime numbers.");
        return flag;
    }

    public static void main(String[] args) {
        int n = 8;
        if (n % 2 == 0) {
            if (isPossible(n) == true)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}

