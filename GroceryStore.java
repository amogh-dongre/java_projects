import java.util.*;
class Product{
    int ProductID,quantity;
    double price;
    String name;
    Product(int ProductID,int quantity,double price,String name){
        this.ProductID=ProductID;
        this.quantity=quantity;
        this.price=price;
        this.name=name;
    }

}
class Customer{
   int CustomerID;
   String name,address,phonenumber;
    Customer(int CustomerID,String name,String address,String phonenumber){
        this.CustomerID=CustomerID;
        this.name=name;
        this.address=address;
        this.phonenumber=phonenumber;
    }
}
class Date{
    String Date;
    Date(String Date){
        this.Date=Date;
    }
}
class Order
{
    int OrderID;
    String customer;
    Date OrderDate;
    ArrayList<Product> items;
    double totalAmount;
    Order(int OrderID,String customer,Date OrderDate,ArrayList<Product> items,double totalAmount){
        this.OrderID=OrderID;
        this.customer=customer;
        this.OrderDate=OrderDate;
        this.items=items;
        this.totalAmount=totalAmount;
    }
}
public class GroceryStore{
    ArrayList<Product> products = new ArrayList<Product>();
    ArrayList<Customer> Customer = new ArrayList<Customer>();
    ArrayList<Order> orders = new ArrayList<Order>();
    Product p;
    double amt =0.0;
    void addProduct(int n){
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<n;i++){
        System.out.println("Enter the Product ID: ");
        int ProductID = sc.nextInt();
        System.out.println("Enter its name: ");
        String name = sc.next();
        System.out.println("Enter " + name + "'s quantity: ");
        int quantity = sc.nextInt();
        System.out.println("Enter " + name + "'s price: ");
        double price = sc.nextDouble();
        amt =  (quantity * price);
        p = new Product(ProductID, quantity, price, name);
        products.add(p);
        // products.add(p.amt);
    }
    }
    void viewProduct(){
        System.out.println(toString());
    }

    void addCustomer(int n){
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<n;i++){
        System.out.println("Enter the Customer ID:");
        int CustomerID = sc.nextInt();
        System.out.println("Enter Customer's name: ");
        String name = sc.next();
        System.out.println("Enter "+name+"'s address:");
        String address = sc.next();
        System.out.println("Enter "+name+"'s phone number:");
        String phonenumber = sc.next();
        Customer c = new Customer(CustomerID, name, address, phonenumber);
        Customer.add(c);
       }
    }
    void viewCustomer(){
        System.out.println(toString());
    }
    void Placeorder(){
        GroceryStore gs = new GroceryStore();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the OrderID: ");
        int OrderID = sc.nextInt();
        System.out.println("Enter the Order Date: ");
        String date = sc.next();
        Date dt = new Date(date);
        Double totalamt = gs.amt;
        ArrayList<Product> items = products;
        Order od = new Order(OrderID, "Amogh" , dt, items, totalamt);
        orders.add(od);
    }
    void viewOrder(){
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "Customer details: "+Customer+"\n Order details: "+orders+"\n Product details: "+products;
    }
}
class TestGroceryStore{
    public static void main(String[] args) {
       GroceryStore gt = new GroceryStore();
       gt.addCustomer(1);
       gt.addProduct(1);
       gt.Placeorder();
       gt.viewCustomer();
       gt.viewProduct();
       gt.viewOrder();
    }
}
