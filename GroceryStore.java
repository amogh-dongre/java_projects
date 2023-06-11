import java.util.ArrayList;
public class GroceryStore{
    void addProduct(int n){
        for(int i =0;i<n;i++){
           products.add(i);
        }
    }
    void addCustomer(){
    }
    void Placeorder(){

    }
    void viewProduct(){

    }
    void orders(){

    }
    void viewOrders(){

    } 
}
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
class Order
{
    int OrderID;
    Customer customer;
    Date OrderDate;
    List<Product> items;
    double totalAmount;
}
