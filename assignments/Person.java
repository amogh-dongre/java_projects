//Source Code
import java.util.*;
class Gender {
    Scanner sc;
    String gender;
    void SGender() {
        System.out.print("Enter Your Gender: ");
        sc = new Scanner(System.in);
        gender = sc.next();
    }
    String GetGender() {
        return gender;
    }
}

class YearInSchool {
    Scanner sc;
    int year;
    void SYear() {
        System.out.print("Enter Your school year: ");
        sc = new Scanner(System.in);
        year = sc.nextInt();
    }
    int GetYear() {
        return year;
    }
}

class Person {
    Scanner sc;
    String name;
    int age;
    Person P1;
    Person() {
        name = "Default";
        age = 0;
    }
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void SetName() {
        System.out.print("Enter Your name: ");
        sc = new Scanner(System.in);
        name = sc.next();
    }
    String GetName() {
        return name;
    }
    void SetAge() {
        System.out.print("Enter Your age: ");
        sc = new Scanner(System.in);
        age = sc.nextInt();
    }
    int GetAge() {
        return age;
    }
    Gender G1 = new Gender();
    void SetGender() {
        G1.SGender();
    }
    String GetGender() {
        return G1.gender;
    }
    public String toString() {
        return ("Person details:"+"\n"+"Name: "+GetName()+"\n"+"Age: "+GetAge()+"\n"+"Gender: "+GetGender());
    }
    boolean reducedFare(Person P1) {
        if ((age < 12)||(age > 64)) {
            return true;
        }
        else {
            return false;
        }
    }
}

class Student extends Person {
    String college;
    double GPA;
    int year;
    Student() {
        name = "Default";
        age = 0;
        college = "Default";
        GPA = 0;
        year = 0;
    }
    Student(String name, int age) {
        super(name, age);
    }
    Student(String name, int age, String college, double GPA) {
        this(name, age);
        this.college = college;
        this.GPA = GPA;
    }
    void SetCollege() {
        System.out.print("Enter Your College: ");
        sc = new Scanner(System.in);
        college = sc.next();
    }
    String GetCollege() {
        return college;
    }
    void SetGPA() {
        System.out.print("Enter Your GPA: ");
        sc = new Scanner(System.in);
        GPA = sc.nextDouble();
    }
    double GetGPA() {
        return GPA;
    }
    YearInSchool Y1 = new YearInSchool();
    void SetYear() {
        Y1.SYear();
    }
    int GetYear() {
        return Y1.year;
    }
    public String toString() {
        return ("Person details:"+"\n"+"Name: "+GetName()+"\n"+"Age: "+GetAge()+"\n"+"Gender: "+GetGender()+"\n"+"College: "+GetCollege()+"\n"+"GPA: "+GetGPA()+"\n"+"Year: "+GetYear());
    }
    boolean reducedFare(Person P1) {
        if ((age < 12)||(age > 64)) {
            return true;
        }
        else {
            return false;
        }
    }
}

class Faculty extends Person {
    String rank, dept;
    double salary;
    Faculty(String name, int age) {
        super(name, age);
    }
    Faculty(String name, int age, String rank, String dept, double salary) {
        this(name, age);
        this.rank = rank;
        this.dept = dept;
        this.salary = salary;
    }
    void SetRank() {
        System.out.print("Enter Your Rank: ");
        sc = new Scanner(System.in);
        rank = sc.next();
    }
    String GetRank() {
        return rank;
    }
    void Setdept() {
        System.out.print("Enter Your Dept: ");
        sc = new Scanner(System.in);
        dept = sc.next();
    }
    String GetDept() {
        return dept; 
    }
    void SetSalary() {
        System.out.print("Enter Your salary: ");
        sc = new Scanner(System.in);
        salary = sc.nextDouble();
    }
    double GetSalary() {
        return salary;
    }
    public String toString() {
        return ("Person details:"+"\n"+"Name: "+GetName()+"\n"+"Age: "+GetAge()+"\n"+"Gender: "+GetGender()+"\n"+"Rank: "+GetRank()+"\n"+"Dept: "+GetDept()+"\n"+"Salary: "+GetSalary());
    }
}

class Staff extends Person {
    double salary;
    int vacation;
    Staff(String name, int age) {
        super(name, age);
    }
    Staff(String name, int age, double salary, int vacation) {
        this(name, age);
        this.salary = salary;
        this.vacation = vacation;
    }
    void SetSalary() {
        System.out.print("Enter Your salary: ");
        sc = new Scanner(System.in);
        salary = sc.nextDouble();
    }
    double GetSalary() {
        return salary;
    }
    void SetVacation() {
        System.out.print("Enter Your vacation days: ");
        sc = new Scanner(System.in);
        vacation = sc.nextInt();
    }
    int GetVacation() {
        return vacation;
    }
    public String toString() {
        return ("Person details:"+"\n"+"Name: "+GetName()+"\n"+"Age: "+GetAge()+"\n"+"Gender: "+GetGender()+"\n"+"Salary: "+GetSalary()+"\n"+"Vacation Period: "+GetVacation());
    }
}

class GradStudent extends Student {
    String dept, thesisTopic;
    GradStudent(String name, int age, String college, double GPA, int year) {
        super(name, age, college, GPA);
        this.year = GetYear();
    }
    GradStudent(String name, int age, String college, double GPA, int year, String dept, String thesisTopic) {
        super(name, age, college, GPA);
        this.year = GetYear();
        this.dept = dept;
        this.thesisTopic = thesisTopic;
    }
    void SetDept() {
        System.out.print("Enter Your Dept: ");
        sc = new Scanner(System.in);
        dept = sc.nextLine();
    }
    String GetDept() {
        return dept;
    }
    void SetThesisTopic() {
        System.out.print("Enter Your Thesis Topic: ");
        sc = new Scanner(System.in);
        thesisTopic = sc.nextLine();
    }
    String GetThesisTopic() {
        return thesisTopic;
    }
    public String toString() {
        return ("Person details:"+"\n"+"Name: "+GetName()+"\n"+"Age: "+GetAge()+"\n"+"Gender: "+GetGender()+"\n"+"College: "+GetCollege()+"\n"+"GPA: "+GetGPA()+"\n"+"Year: "+GetYear()+"\n"+"Dept: "+GetDept()+"\n"+"Thesis Topic: "+GetThesisTopic());
    }
}

//Driver Code
class Assignment7 {
    public static void main(String args[]) {
        Person P = new Person();
        P.SetName();
        P.SetAge();
        P.SetGender();
        Person P1 = new Person(P.GetName(),P.GetAge());
        System.out.println("//With Person Object - Eligibility for fees reduction: "+P1.reducedFare(P1));
        Person S = new Student();
        S.SetName();
        S.SetAge();
        S.SetGender();
        System.out.println("//With Student Object - Eligibility for fees reduction: "+S.reducedFare(P1));
        Staff st = new Staff(S.GetName(),S.GetAge());
        st.SetName();
        st.SetAge();
        st.SetSalary();
        st.SetSalary();
        st.SetVacation();
        Staff st1 =new Staff(S.GetName(), S.GetAge(), st.GetSalary(),st.GetVacation());
        System.out.println(st1.toString());
        Student stu = new Student(S.GetName(),S.GetAge());
        stu.SetCollege();
        stu.SetGPA();
        Student stu1 = new Student(S.GetName(), S.GetAge(), stu.GetCollege(), stu.GetGPA());
        stu1.SetYear();
        GradStudent g1 = new GradStudent(S.GetName(), S.GetAge(), stu.GetCollege(), stu.GetGPA(),stu1.GetYear());
        g1.SetDept();
        g1.SetThesisTopic();
        GradStudent g2 = new GradStudent(S.GetName(), S.GetAge(),stu.GetCollege(), stu.GetGPA(), stu1.GetYear(), g1.GetDept(), g1.GetThesisTopic());
        System.out.println(g2.toString());
    }
}
