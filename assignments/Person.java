import java.util.* ;

import Person.Gender;
class Person{
    Gender g1;
    Scanner sc;
    String name;
    int age;
    Person(String name,int age,Gender g1){
        this.age=age;
        this.name=name;
        this.g1=g1;
    }
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
    boolean reducedFare(){
    if(age < 12 || age > 64){
     return true;
    }
    else{
     return false;
    }

}
class Gender extends Person{
    String gender;
    Gender(String name,int age,Gender g1){
        super(name, age,g1);
    }
    Gender(String name,int age,Gender g1,String gender){
        this(name, age,g1);
        this.gender=gender;
    }
}
class Student extends Person{
    String college;
    double gpa;
    YearInSchool y1;
    Student(String name,int age,Gender g1){
        super(name, age,g1);
    }
    Student(String name,int age,Gender g1,String college,double gpa){
        this(name, age,g1);
        this.college=college;
        this.gpa=gpa;
    }
    String getCollege(){
        return college;
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
    YearInSchool(String name,int age,Gender g1,String college,double gpa){
        super(name, age,g1, college, gpa);
    }
    YearInSchool(String name,int age,Gender g1,String college,double gpa,int year){
        this(name, age,g1, college, gpa);
        this.year=year;
    }
}
class faculty extends Person{
    String rank;
    String dept;
    double salary;
    faculty(String name,int age,Gender g1){
        super(name, age,g1);
    }
    faculty(String name,int age,Gender g1,String rank,String dept,double salary){
     this(name, age,g1);
     this.rank=rank;
     this.dept=dept;
     this.salary=salary;
    }
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
    Staff(String name,int age,Gender g1){
        super(name, age,g1);
    }
    Staff(String name,int age,Gender g1,double salary,int vacay){
        this(name, age,g1);
        this.salary=salary;
        this.vacay=vacay;

    }
    double getSalary(){
        return salary;
    }
    void setSalary(double salary){
        this.salary=salary;
    }
    int getVacation(){
        return vacay;
    }
    void setVacation(int vacay){
        this.vacay=vacay;
    }
}
class GradStudent extends Student{
    String dept,thesis_topic;
    GradStudent(String name,int age,Gender g1,String college,double gpa){
        super(name, age,g1, college, gpa);
    }
    GradStudent(String name,int age,String college,Gender g1,double gpa,String dept,String thesis_topic){
        this(name, age,g1, college, gpa);
        this.thesis_topic=thesis_topic;
        this.dept=dept;
    }
    public String toString() {
    return "Student department: "+dept+" "+"Student thesis topic "+thesis_topic;

    }
}
}
class driver{
    public static void main(String[] args) {
        Gender g2 = new Gender()
        Person p1 = new Person("Karthik", 20,"male");
        System.out.println(p1.reducedFare());
    }
}
