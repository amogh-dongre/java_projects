import java.util.*;
class recursion{
 char[] rec_str(String s,int start,int end)
    {
        char a[] = new char[end];
        for(int i=start;i<=end;i++){
            a[i]=s.charAt(i);
        }
       return a;
    }

public static void main(String[] args) {
        recursion ob1= new recursion();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s =sc.nextLine();
        System.out.println("Enter the start index: ");
        int start=sc.nextInt();
        System.out.println("Enter the end index: ");
        int end=sc.nextInt();
        ob1.rec_str(s, start, end);
    }
}
