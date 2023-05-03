package amogh.util;
public class factorial
{
    public static int n;
    public static int fact = 1;
    public factorial(int n){
        factorial.n=n;
    }
    public static int factorial(){
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
}
