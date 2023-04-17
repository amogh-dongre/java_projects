package com.arssoft.number.util;
public class armstrong{
    public static boolean isarmstrong(int n){
        int res;
        int n_cpy = n;
        while(n!=0){
            int rem = (int)(n%10);
            res+= rem*rem*rem;
            n=(int) (n/10);
        }
        if(res==n_cpy){
            return true;
        }
        else{
            return false;
        }
    }
}
