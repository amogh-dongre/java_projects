import java.util.Scanner;
public class que15 {
    public static int square(int a){
        int b = a*a;
        return b ;
    }
    public static int cubes(int a){
        int d = a*a*a;
        return d;
    }
    public static int quartic(int a){
        return square(a)*square(a);
    }
    public  static int quintic(int a){
        return square(a)*cubes(a);
    }
    public static void main(String args[]){
        System.out.println("Enter your number : ");
        Scanner ib = new Scanner(System.in);
        int a = ib.nextInt();
        que15 ob1= new que15();
        System.out.println("Integer "+"Square "+"Cube \t"+"Quartic "+"Quintic");
        for(int i =1;i<26;i++) {
            System.out.print(i+"\t");
            System.out.print(ob1.square(i) + " \t");
            System.out.print(ob1.cubes(i) + " \t");
            System.out.print(ob1.quartic(i) + " \t");
            System.out.print(ob1.quintic(i) + " \t");
            System.out.println();

        }
    }
}