import java.util.*;
class ques19{
    Scanner sc;
    int i1,i2;
    ques19(){
      i1=i2=0;
    }
    ques19(int n){
        i1=n;
        i2=0;
    }
    ques19(int n1,int n2){
        i1=n1;
        i2=n2;
    }
    String getAccess(){
        return i1+" "+i2;
    }
    void setMutate(int i1,int i2){
        this.i1=i1;
        this.i2=i2;
    }
    String minMax(){
        ques19 q1= new ques19();
        sc= new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i =0;i<n;i++){
            System.out.print("Enter the "+(i+1)+" element: ");
            ar[i]=sc.nextInt();
        }
        for(int i = 0;i < n-1; i++){
            for(int j=0;j<n-i-1;j++){
                if(ar[j]>ar[j+1]){
                    int temp =ar[j+1];
                    ar[j+1]=ar[j];
                    ar[j]=temp;
                }
            }
        }
        return ar[0]+" "+ar[ar.length-1];
    }
    public static void main(String[] args) {
        ques19 obj = new ques19();
        ques19 obj2 = new ques19(1);
        ques19 obj3 = new ques19(1,2);
        obj.setMutate(0, 0);
        System.out.println(obj.getAccess());
        System.out.println(obj.minMax());
        obj2.setMutate(1, 2);
        System.out.println(obj2.getAccess());
        System.out.println(obj2.minMax());
        obj3.setMutate(1, 2);
        System.out.println( obj3.getAccess());
        System.out.println(obj3.minMax());
    }

}
