package com.arssoft.number.util;
public class factorial
{
    public static int n;
    public static int fact;
    public factorial(int n){
        this.n=n;
    }
    public static int factorial(){
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
}
