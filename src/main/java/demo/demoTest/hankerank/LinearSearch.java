package demo.demoTest.hankerank;

public class LinearSearch {
    public static int search(int [] arr,int x){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==x){
                return x;
            }
        }
        return -1;
    }
    public static void main(String[] arg){
        int arr[]={2,4,6,7,9};
        int result=search(arr,8);
        System.out.println(result);
    }
}
