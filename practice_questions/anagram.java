import java.util.*;
class anagram{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String a,b,rev="";
        System.out.print("Enter the first word: ");
        a = sc.next();
        System.out.print("Enter the second word: ");
        b = sc.next();
        for(int i =a.length()-1;i>=0;i--){
            rev+=a.charAt(i);
        }
        if(a.equalsIgnoreCase(b)){
            System.out.println("Anagrams");
        }
        else if(rev.equalsIgnoreCase(b)){
            System.out.println("Anagrams");
        }
        else
            System.out.println("Not Anagrams");
    }
}
