import java.util.*;
class percentages{
    public static void main(String[] args) {
        double a,b;
        percentages p = new percentages();
        Scanner sc = new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        p.computePercent(a,b);
        p.computePercent(b,a);
        System.out.println("hello");
    }
    void computePercent(double a,double b){
            int per=(int)((a/b)*100);
            System.out.println(a+"is "+per+" percent of "+b);
        }
}
