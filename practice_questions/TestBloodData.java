import java.util.*;
class Blooddata{
 String bloodtype;
 char Rh_factor;
    Blooddata(){
        bloodtype="O";
        Rh_factor="+";
    }
    Blooddata(String bloodtype , char Rh_factor){
        this.bloodtype = bloodtype;
        this.Rh_factor = Rh_factor;
 }
}
class TestBloodData{
 public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the blood group");
     String type=sc.next();
     System.out.println("Enter the Rh-factor as + or -");
     String factor=sc.nextLine().charAt(0);
     Blooddata b1 = new Blooddata(type,factor);
 }
}
