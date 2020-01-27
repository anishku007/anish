package demo.demoTest.hankerank;

public class TowerOfHanoi {

    public static void recursionAlgo(int n,char A,char B,char C){
        if(0==n)
            return;
        recursionAlgo(n-1,A,C,B);
        System.out.printf("Move the disk %d from %c to %c\n",
                n, A, C);
        recursionAlgo(n-1,B,A,C);
    }

    public static void main(String[] arg){
        recursionAlgo(3,'A','B','C');
    }
}
