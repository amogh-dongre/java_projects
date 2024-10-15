import java.util.*;
class exchangespoon{
    String hour;
    boolean flag =false;
    synchronized String get(){
        hour="Son and Father is waiting.";
        while(!flag)
            try
                {
                 wait();
                }
            catch(InterruptedException ie){
                System.out.println(ie);
            }
            System.out.println("Spoon is in hands of "+ hour);
            flag=false;
            notify();
            return hour;
    }
    synchronized void put(String n){
        while(flag)
            try{
                wait();
            }
            catch(InterruptedException ie){
                System.out.println(ie);
            }
        flag=true;
        System.out.println(n);
        notify();
    }
}
class Father implements Runnable{
    exchangespoon e;
    Thread t;
    Father(exchangespoon e){
        this.e=e;
        t = new Thread(this, "Spoon is in hands of Father and Son is waiting.");
    }
    @Override
    public void run() {
        String i="Spoon is in hands of Father and Son is waiting.";
        int cnt=0;
        while(cnt<2){
            e.put(i);
            System.out.println();
            cnt++;
        }
    }
}
class Son implements Runnable{
    exchangespoon e1;
    Thread t;
    Son(exchangespoon e1){
        this.e1=e1;
        t = new Thread(this, "Spoon is in hands of Son and Father is waiting.");
    }
    @Override
    public void run() {
        int i=0;
        while(i<2){
            e1.get();
            System.out.println();
            i++;
        }
    }
}
class TestFather_Son {
    public static void main(String[] args) {
        exchangespoon e = new exchangespoon();
        Father s = new Father(e);
        Son v = new Son(e);
        s.t.start();
        v.t.start();
    }
}
