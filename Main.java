import amogh.util.armstrong;
import amogh.util.factorial;
import amogh.util.palindrome;
public class Main {
    public static void main(String[] args) {
        armstrong a1= new armstrong(153);
        palindrome p1 = new palindrome(1221);
        factorial f1 = new factorial(5);
        System.out.println(a1.isarmstrong());
        System.out.println(p1.ispalindrome());
        System.out.println(f1.factorial()); 
    }
}
