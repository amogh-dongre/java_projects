import java.util.*;
class Car{
    double eff;
    int fuel;
    Car(double eff){
        fuel=0;
        this.eff=eff;
    }
    void drive(int dist){
        int fuel_req= (int)(dist/eff);

    }
    void addGas(int liter){
        fuel+=liter;
    }
    int getGasInTank(){
       return fuel;
    }
}
class Cartester{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        double efficiency= sc.nextDouble();
        Car c= new Car(efficiency);
        System.out.println("Enter the fuel to be filled");
        int fuel_add= sc.nextInt();
        c.addGas(fuel_add);
        c.drive(80);
        System.out.println("The amount of fuel in tank "+c.getGasInTank());
    }
}
