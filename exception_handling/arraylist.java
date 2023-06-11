import java.util.*;
class arrlist{
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("one");
        a1.add("two");
        a1.add("three");
        a1.add("four");
        a1.add("five");
        a1.add("six");
            while(a1.hasNext()){
                i=0;
                a1.set(i, a1.get(i+1));
                a1.set(i+1,a1.get(i));
                i++;
            }
        System.out.println(a1);
    }
}
