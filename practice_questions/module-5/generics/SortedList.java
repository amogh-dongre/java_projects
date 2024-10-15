import java.util.*;
class SortedList <T extends Comparable<T>>{
    public static <T extends Comparable<T>> void sort(T[] arr){
        int n = arr.length;
        for (int i =0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    T temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static <T extends Comparable<T>> void display(T[] arr){
        System.out.println("Correct order");
        for(T i:arr)
            System.out.println(i);
        System.out.println("Reverse order");
        for (int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
class TestSortedList{
    public static void main(String[] args) {
        SortedList s = new SortedList();
        Integer[] amd = {1,3,2,4,8,6,5,7,2,9};
        s.sort(amd);
        s.display(amd);
        String[] str = {"Apple","Coconut","Banana","Juice","Masala Dose","Idli"};
        s.sort(str);
        s.display(str);
    }
}
