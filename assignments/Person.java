import java.util.* ;
class Person{
    Gender g1;
    Scanner sc;
    String name;
    int age;
    Person(String name,int age){
        this.age=age;
        this.name=name;
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
    if(age < 12 && age > 64){
     return true;
    else{
     return false;
    }
}
class Gender extends Person{
    String gender;
    Gender(String name,int age){
        super(name, age);
    }
    Gender(String name,int age,String gender){
        this(name, age);
        this.gender=gender;
    }
}
class Student extends Person{
    String college;
    double gpa;
    YearInSchool y1;
    Student(String name,int age){
        super(name, age);
    }
    Student(String name,int age,String college,double gpa){
        super(name, age);
        this.college=college;
        this.gpa=gpa;
    }
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
    YearInSchool(String name,int age,String college,double gpa){
        super(name, age, college, gpa);
    }
    YearInSchool(String name,int age,String college,double gpa,int year){
        this(name, age, college, gpa);
        this.year=year;
    }
}
class faculty extends Person{
    String rank;
    String dept;
    double salary;
    faculty(String name,int age){
        super(name, age);
    }
    faculty(String name,int age,String rank,String dept,double salary){
     super(name, age);
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
    Staff(String name,int age){
        super(name, age);
    }
    Staff(String name,int age,double salary,int vacay){
        super(name, age);
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
    GradStudent(String name,int age,String college,double gpa){
        super(name, age, college, gpa);
    }
    GradStudent(String name,int age,String college,double gpa,aString dept,String thesis_topic){
        super(name, age, college, gpa);
        this.thesis_topic=thesis_topic;
        this.dept=dept;
    }
    public String toString() {
    return "Student department: "+dept+" "+"Student thesis topic "+thesis_topic;

    }
}
