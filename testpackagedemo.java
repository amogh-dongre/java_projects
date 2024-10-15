import amogh.util.factorial;
import amogh.util.armstrong;
import amogh.util.palindrome;
class TestPackageDemo{
    public static void main(String args[]) {
        palindrome p1 = new palindrome(1221);
        armstrong a1 = new armstrong(153);
        System.out.println("5's factorial is: "+factorial.factorial());
        System.out.println("Is 1221 a palindrome? "+palindrome.ispalindrome());
        System.out.println("Is 153 an armstrong number? "+armstrong.isarmstrong());

    }
}
