import java.util.*;
class WorkingCarException extends RuntimeException{
    int type;
    WorkingCarException(int type){
        this.type=type;
    }
    String eval(){
        if(type==1)
            return "VIN is not 4 digits";
        else if (type==2)
            return "Brand must be Ford,Honda,Toyota,Chrysler or other";
        else if (type==3)
            return "The year must be between 1997 and 2007";
        else if (type==4)
            return "The mileage/price cannot be NEGATIVE";
        else
            return "null";

    }
    @Override
    public String toString() {
        return eval();
    }
}
class workingcar {
    String VIN,brand;
    int year;
    double price,mileage;
    workingcar(String VIN,String brand,int year,double price,double mileage){
        try{
        if(VIN.length()!=4)
            throw new WorkingCarException(1);
        else
            this.VIN=VIN;
        }
        catch(WorkingCarException we){
            System.out.println(we);
        }
        try{
        if (brand !="Ford" || brand !="Honda" || brand != "Toyota" || brand !="Chrysler" || brand != "other")
            throw new WorkingCarException(2);
        else
            this.brand=brand;
        }
        catch(WorkingCarException we){
            System.out.println(we);
        }
        try{
        if (year<1997 || year>2017)
            throw new WorkingCarException(3);
        else
            this.year=year;
        }
        catch(WorkingCarException we){
            System.out.println(we);
        }
        try{
        if (price<0.0 || mileage <0.0)
            throw new WorkingCarException(4);
        else{
            this.price=price;
            this.mileage=mileage;
        }
        }
        catch(WorkingCarException we){
            System.out.println(we);
        }
    }
}
class TestWorkingCarException{
    public static void main(String[] args) {
      String vin="",brand="";
      int year=0;
      double price=0.0,mileage=0.0;
      workingcar[] wc = new workingcar[7];
      Scanner sc = new Scanner(System.in);
      for (int i =0;i<7;i++){
          vin =sc.next();
          brand=sc.next();
          year = sc.nextInt();
          price=sc.nextDouble();
          mileage=sc.nextDouble();
          wc[i]= new workingcar(vin,brand,year,price,mileage);
      }
      System.out.println(Arrays.toString(wc));
    }
}
