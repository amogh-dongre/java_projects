package com.arssoft.number.util;
public class factorial
{
    public static int fact;
    public static int factorial(int n){
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
}
