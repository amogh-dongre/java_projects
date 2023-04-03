import java.util.*;
class tickets{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a six digit number: ");
        int n = sc.nextInt();
        int rem = (int)(n%10);
        int res = (n-rem)/10;
        System.out.println(rem);
        System.out.println(res/7);
        if (rem==(int)(res/7)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
