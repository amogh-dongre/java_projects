import java.util.*;
class C{
    public static void main(String args[]){
        Integer ar1[] = {1,2,3,4,5,6,7,8,9,10};
        String ar2[] = {"Rama","Krishna","Siva","Lakshmi"};
        printArray(ar1);
        printArray(ar2);
    }
    public static <T> void printArray(T array[]){
        for(int i =0;i<array.length;i++){
            System.out.println(array[i]);
            System.out.println();
        }
    }
}
