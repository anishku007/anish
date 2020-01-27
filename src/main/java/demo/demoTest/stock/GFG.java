package demo.demoTest.stock;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Stream;

public class GFG {
    // Function to do count sort
    // seq[]: input array
    public static void countSort(char seq[])
    {
        Arrays.sort(seq);
        System.out.println(seq);
        // add your code here
    }
  /*  public Stack<Integer> sort(Stack<Integer> s) {
    }
    }
//return Collections.sort(s,e->e.peek()-s.peek());
   // }
*/
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            String s=sc.next();
            countSort(s.toCharArray());
        }
    }
}
