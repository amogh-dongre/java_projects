import java.util.*;
class bubblesort_gen{
    public static <T extends Comparable <T>> void sort(T[] arr){
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
    public static void main(String[] args) {
        Integer[] intarr = {1,2,0,8,3,6,9,7,5};
        sort(intarr);
        String[] str = {"Apple","Coconut","Banana","Juice","Masala Dose","Idli"};
        sort(str);
        for(int i : intarr){
            System.out.print(i+",");
        }
        System.out.println();
        for(String  i: str){
            System.out.print(i+",");
        }
    }
}
