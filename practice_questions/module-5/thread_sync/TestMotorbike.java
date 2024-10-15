import java.util.*;
class exchangebike{
    String hour;
    boolean flag =false;
    synchronized String get(){
        hour="Vinod";
        while(!flag)
            try
                {
                 wait();
                }
            catch(InterruptedException ie){
                System.out.println(ie);
            }
            System.out.println("Motorbike is in hands of:  "+ hour);
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
class Saketh implements Runnable{
    exchangebike e;
    Thread t;
    Saketh(exchangebike e){
        this.e=e;
        t = new Thread(this, "Motorbike is in hands of: Saketh ");
    }
    @Override
    public void run() {
        String i="Motorbike is in hands of: Saketh";
        while(true){
            e.put(i);
        }
    }
}
class Vinod implements Runnable{
    exchangebike e1;
    Thread t;
    Vinod(exchangebike e1){
        this.e1=e1;
        t = new Thread(this, "Motorbike is in hands of Vinod ");
    }
    @Override
    public void run() {
        while(true){
            e1.get();
        }
    }
}
class TestMotorbike {
    public static void main(String[] args) {
        exchangebike e = new exchangebike();
        Saketh s = new Saketh(e);
        Vinod v = new Vinod(e);
        s.t.start();
        v.t.start();
    }
}
