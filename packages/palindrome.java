package com.arssoft.number.util;
public class palindrome{
    public static boolean ispalindrome(int n){
        int n_cpy = n;
        int rev=0;
        while(n!=0){
            int rem = (int)(n%10);
            rev += rev*10+rem;
            n = (int) (n/10);
        }
        if(rev==n_cpy){
            return true;
        }
        else{
            return false;
        }
    }
}
