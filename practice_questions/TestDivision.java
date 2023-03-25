import java.util.*;
class Division{
    String name;
    int id;
    Division(String name,int id){
        this.name=name;
        this.id=id;
    }
    void display(){
        System.out.println("id: "+id);
        System.out.println("name: "+name);
    }
}
class International extends Division{
    String location;
    String language;
    International(String name,int id,String location,String language){
        super(name,id);
        this.location=location;
        this.language=language;
    }
    void display(){
        super.display();
        System.out.println("International location: "+location);
        System.out.println("International language spoken: "+language);
        System.out.println();
    }

}
class Domestic extends Division{
    String location;
    String language;
    Domestic(String name,int id,String location,String language){
        super(name, id);
        this.location=location;
        this.language=language;
    }
    void display(){
        super.display();
        System.out.println("Domestic location: "+location);
        System.out.println("Domestic language spoken: "+language);
        System.out.println();
    }
}
class Company{
    International obj;
    Domestic ob1;
    String comp_name;
    Company(International obj,Domestic ob1,String comp_name){
        this.obj=obj;
        this.ob1=ob1;
        this.comp_name=comp_name;
    }
    void display(){
        System.out.println("Company name: "+comp_name);
        obj.display();
        ob1.display();
    }
}
class TestDivision{
    public static void main(String[] args) {
        String company1="ABC";
        String company2="XYZ";
        International i1= new International(company1, 1, "USA", "English");
        Domestic d2= new Domestic(company2, 2,"India" , "Marathi");
        International i2= new International(company1, 3, "Mexico", "Spanish");
        Domestic d3= new Domestic(company2, 2,"India" , "kannada");
        Company c1 = new Company(i1, d2, company1);
        Company c2 = new Company(i2, d3, company2);
        c1.display();
        c2.display();
    }
}
