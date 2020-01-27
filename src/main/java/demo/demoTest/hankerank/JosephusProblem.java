package demo.demoTest.hankerank;

public class JosephusProblem {

    private static int josephus(int n, int k){
        if (n == 1)
            return 1;
           else
               return (josephus(n-1,  k)+k-1)%n+1;
        }

    public static void main(String[] args) {
     int k=2;
     int n=10;
     System.out.println("survive:="+josephus(n,k));
    }
}
