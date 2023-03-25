import java.util.*;
class Shopping{
    int price,quantity,mobile_brand_code;
    String mobile_brand_name;
    Shopping(int p,int q,int mbc,String mbn){
        price=p;
        quantity=q;
        mobile_brand_code=mbc;
        mobile_brand_name=mbn;
    }
     void Payment(){
        int totalamount=price*quantity;
        if(totalamount>20000){
            double amt = (double) (totalamount-(totalamount*0.1));
            System.out.println("The payable amount is: "+amt);
        }
        else if(totalamount>10000 && totalamount<=20000){
            double amt = (double) (totalamount-(totalamount*0.05));
            System.out.println("The payable amount is: "+amt);
        }
        else{
            System.out.println("No discount applicable");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price,quatity and brand code: ");
        int pr=sc.nextInt();
        int qt=sc.nextInt();
        int code=sc.nextInt();
        System.out.println("Enter the mobile brand name: ");
        String name=sc.next();
        Shopping obj =new Shopping(pr,qt,code,name);
        obj.Payment();
    }
}
