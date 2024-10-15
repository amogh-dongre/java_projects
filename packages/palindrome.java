package amogh.util;
public class palindrome{
    public static int n;
    public palindrome(int n){
        palindrome.n=n;
    }
    public static boolean ispalindrome(){
        int n_cpy = n;
        int rev=0;
        while(n!=0){
            int rem = (n%10);
            rev = rev*10+rem;
            n /=10;
        }
        return rev == n_cpy;
    }
}
