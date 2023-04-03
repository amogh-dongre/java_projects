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
    Gender getGender(){
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
class Student extends Person{
    String college;
    double gpa;
    YearInSchool y1;
    String getCollege(){
        retrun college;
    }
    void setCollege(String college){
        this.college=college;
    }
    double getGPA(){
        return gpa;
    }
    void setGPA(double gpa){
        this.gpa=gpa;
    }
    YearInSchool getYear(){
        return y1;
    }
    void setYear(YearInSchool y1){
        this.y1=y1;
    }
}
class YearInSchool extends Student{
    int year;
    YearInSchool(int year){
        this.year=year;
    }
}
class faculty extends Person{
    String rank;
    String dept;
    double salary;
    String getRank(){
        return rank;
    }
    void setRank(String rank){
        this.rank=rank;
    }
    String getDept(){
        return dept;
    }
    void setDept(String dept){
        this.dept=dept;
    }
    double getSalary(){
        return salary;
    }
    void setSalary(double salary){
        this.salary=salary;
    }
}
class Staff extends Person{
    double salary;
    int vacay;

}
