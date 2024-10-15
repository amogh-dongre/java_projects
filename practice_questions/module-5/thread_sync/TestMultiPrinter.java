/* One printer muti users pinging it at the same time so printer needs to handle it separately.
 *Printer is represented by a class printer and it has a print() which sequentially prints one page after another.
 * After completing on page it will read next page from the memory,then it starts printing of next page.////
 * Three Employees are represented by a thread they are going to issue a print command using print() of printer class
 * In main thread we create instance of printer,three threads of user class and then three threads are started and the main thread
 * wait for completion of all other threads.
 * */
import java.util.*;
class Printer{
     void print(String ar[]){
         synchronized(this){
        for(int i=0;i<ar.length;i++){
            try{
                Thread.sleep(20);
            }
            catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
    }


}
class User extends Thread {
    String s[];
    Printer p;
    User(String[] s,Printer p){
        this.s=s;
        this.p=p;
    }
    @Override
    public void run() {
        p.print(s);
    }
}
public class TestMultiPrinter{
    public static void main(String[] args) throws InterruptedException {
        Printer p = new Printer();
        String s1[] ={"Apple","Coconut","Banana","Juice","Masala Dose","Idli"};
        String s2[]= {"Job 2","Job 2","Job 2","Job 2","Job 2"};
        String s3[]= {"Job 3","Job 3","Job 3","Job 3","Job 3"};
        User u1 = new User(s1, p);
        User u2 = new User(s2, p);
        User u3 = new User(s3, p);
        u1.start();
        u2.start();
        u3.start();
        u1.join();
        u2.join();
        u3.join();

    }
}
