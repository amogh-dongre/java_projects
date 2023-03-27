// Question 18
import java.util.*;
class concat{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of the array");
        int n =sc.nextInt();
        char[] ar= new char[n];
         for(int i=0; i<n;i++){
             System.out.print("Enter the "+(i+1)+" element: ");
             ar[i]=sc.next().charAt(0);
         }
         String conc="";
         for (int index = 0; index < ar.length; index++) {
             conc+=ar[index];
         }
         System.out.println("The concatinated string is: "+conc);
    }
}
