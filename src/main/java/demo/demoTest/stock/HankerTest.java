package demo.demoTest.stock;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HankerTest {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
    for(int i=0;i<n;i++){

    }

        return n;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

   /* *//*
     * Complete the simpleArraySum function below.
     *//*
    static int simpleArraySum(int[] ar) {
        *//*
         * Write your code here.
         *//*
        int sum=0;
        for(int i=0;i<ar.length;i++){
            sum=sum+ar[i];
        }
        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(scanner.nextLine().trim());

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");

        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        int result = simpleArraySum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}*/

    // Complete the solve function below.
    /*static void solve(double meal_cost, int tip_percent, int tax_percent) {
        int totalcost = Math.round(meal_cost + meal_cost * tip_percent / 100 + meal_cost * tax_percent / 100);
        System.out.println("" + Math.round(totalcost));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }

}



*/


/*Data Type*/
   /* public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);
        List<String> string=new ArrayList<String>();
        string.add(scan.next());
        System.out.println(i+scan.nextInt());
        System.out.println(d+scan.nextDouble());
        System.out.println(s + string);
        scan.close();
    }*/
