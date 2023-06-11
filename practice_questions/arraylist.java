import java.util.*;
class ArrayListDemo {
    public static void main(String args[]) {
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Initial size of al: " + al.size());
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println("Contents of al before sort: " + al);
        Collections.sort(al);
        System.out.println("Contents of al after sort: " +(al));
    }
}
