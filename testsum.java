import java.util.*;
class sum {
    public static void main(String[] args) {
        int n =10 ;
        int n_2 = 0;
        String str  = Integer.toString(n_2);
        for (int i = 0; i <str.length(); i++) {
           int x = n%10;
           n = n/10;
           n_2+= x;
        }
        System.out.println(n_2);
    }
}
