import java.util.* ;
class Person{
    Gender g1;
    Scanner sc;
    String name;
    int age;
    String getName(){
        return name;
    }
    void setName(String name ){
        this.name=name;
    }
    int getAge(){
        return age;
    }
    void setAge(int age){
        this.age=age;
    }
    String getGender(){
        return g1;
    }
    void setGender(Gender g1){
        this.g1=g1;
    }

}
class Gender extends Person{
    String gender;
    Gender(String gender){
        this.gender=gender;
    }
}
