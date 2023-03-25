import java.util.*;
class percentages
{
    double a,b;
    percentages(){
        a=0.0;
        b=0.0;
    }
    percentages(double a, double b){
        this.a=a;
        this.b=b;
    }
    void computePercent(){
        int per = (int)((a/b)*100);
        System.out.println(a+"is "+per+" percent of "+b);
    }
    public static void main(String[] args) {
        percentages p1 = new percentages();
        double a,b;

        percentages p2 = new percentages();
    }
}
