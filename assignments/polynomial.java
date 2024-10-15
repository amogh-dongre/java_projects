//Question 20
import java.util.*;
class polynomial{
    int[] arr;
    int x,n,result;
    polynomial p1;
    polynomial(int[] arr,int x,int n){
        this.arr=arr;
        this.x=x;
        this.n=n;
    }
     void compute(){
        for(int i=1;i<n;i++){
             result=arr[0];
             result=result*x+arr[i];
             }
    }
     public String toString(){
         return "result value: "+result;
     }
    public static void main(String[] args) {
        int[] arr={2,-6,2,-1};
        int x=3;
        int n=arr.length;
        polynomial p2 = new polynomial(arr, x, n);
        p2.compute();
        System.out.println(p2.toString());
    }
}
