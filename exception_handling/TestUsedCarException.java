import java.util.*;
class UsedCarException extends RuntimeException{
    int subtype;
    UsedCarException(int type){
        subtype = type;
    }
    String evalException(){
        if (subtype==1)
            return "VIN should be 4 digits";
        else if (subtype==2)
            return "Make should be Ford,Toyota,Honda or other";
        else if (subtype == 3)
            return "Year should be between 2005 and 2019";
        else if (subtype==4)
            return "Price and mileage cannot be negative";
        else
            return "null";
    }
    @Override
    public String toString() {
        return evalException();
    }
}
class UsedCar {
    String VIN;
    String make;
    int year;
    double mileage,price;
    UsedCar(String VIN,String make,int year, double mileage,double price){
        if(VIN.length() !=4)
            throw new UsedCarException(1);
        else
            this.VIN = VIN;
        if (make=="Ford " || make==" Toyota "||make=="Honda " || make==" other ")
            this.make=make;
        else
            throw new UsedCarException(2);
        if(year<2005 && year>2019)
            throw new UsedCarException(3);
        else
            this.year = year;
        if(price< 0.0 || mileage<0.0 )
            throw new UsedCarException(4);
        else{
            this.price= price;
            this.mileage= mileage;
        }

    }
}
class TestUsedCar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the VIN of the Car: ");
        String vin = sc.nextLine();
        System.out.println("Enter the make of the Car: ");
        String make = sc.nextLine();
        System.out.println("Enter the model year of the Car: ");
        int year = sc.nextInt();
        System.out.println("Enter the mileage of the Car: ");
        double mileage=sc.nextDouble();
        System.out.println("Enter the price of the Car: ");
        double price = sc.nextDouble();
        UsedCar uc = new UsedCar(vin, make, year, mileage, price);

    }
}
