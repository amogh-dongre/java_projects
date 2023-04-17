package com.arssoft.number.util;
public class armstrong{
    public static int n;
    public armstrong(int n){
        this.n=n;
    }
    public static boolean isarmstrong(){
        int res=0;
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
