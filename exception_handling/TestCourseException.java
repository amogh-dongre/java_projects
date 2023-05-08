import java.util.*;
class CourseException extends RuntimeException{
    int subtype;
    CourseException(int type){
        subtype = type;
    }
    String evalException(){
        if (subtype==1)
            return "Course name should be 3 letters";
        else if (subtype==2)
            return "Couse code should be between 1001 and 9999 ";
        else if (subtype == 3)
            return "Credits should be minimum of 1 and maximum of 6";
        else
            return "null";
    }
    @Override
    public String toString() {
        return evalException();
    }
}
class Course {
    int code,credits;
    String Course;
    Course(String Course,int code,int credits){
        try{
            if (Course.length() !=3)
                throw new CourseException(2);
            else
                this.Course = Course;
        }
        catch(CourseException ce){
            System.out.println(ce);
            }

        try{
            if(code<1001 || code>9999)
                throw new CourseException(1);
            else
                this.code=code;
        }
        catch(CourseException ce){
            System.out.println(ce);
            }
        try{
            if(credits<1 || credits>6)
                throw new CourseException(3);
            else
                this.credits = credits;
        }
        catch(CourseException ce){
            System.out.println(ce);
            }
    }
}
class TestCourseException{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Course: ");
        String cr= sc.next();
        System.out.print("Enter the code: ");
        int code = sc.nextInt();
        System.out.println("Enter the credits");
        int credits = sc.nextInt();
        Course crs = new Course(cr, code, credits);
    }
}
