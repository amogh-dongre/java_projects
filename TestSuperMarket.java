class Product{

 String name;
 double price;
 int discount;
 
 Product(String name , double price , int discount){
  
  this.name = name;
  this.price = price;
  this.discount = discount;
 }
}
class ProductBasket{
  
  Product p[];
  ProductBasket(int noofitems){
  p = new Product[noofitems];
  }
}
class ProductPrinter{
 
  ProductBasket pb;
  ProductPrinter(ProductBasket pb){
  
   this.pb = pb;
  }
  void display(){
   double cost,total = 0;
   for(int i =0; i<pb.p.length; i++){
     
     System.out.println("Item name:" + "\t" + "Price after discount");
     cost = pb.p[i].price -(pb.p[i].price * pb.p[i].discount/100);
     total = total + cost;
     System.out.println(pb.p[i].name + "\t" + cost);
   }
    System.out.println("Total price is:" + total);
  }
}
class TestSuperMarket{
  public static void main(String args[]){

    Product p1 = new Product("Milk",20,5);
    Product p2 = new Product("Chocolate",50,2);
    Product p3 = new Product("Ice cream",200,10);
    ProductBasket pb = new ProductBasket(3);
    pb.p[0]=p1;
    pb.p[1]=p2;
    pb.p[2]=p3;
    ProductPrinter pp = new ProductPrinter(pb);
    pp.display();
  }
}
    


 
