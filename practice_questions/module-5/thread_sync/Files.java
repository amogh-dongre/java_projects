import java.util.*;
class Saver{
    int Memory;
    int filesize;
    Saver(){
        Memory = 50;
        filesize = 10;
    }
}
class Filzer{
    int memory;
    int savesize;
    Saver s1;
    Filzer(Saver s1,int savesize){
        this.s1 = s1;
        this.savesize = savesize;
        memory = s1.Memory;
    }
    synchronized void saving(){
        if(savesize < memory){
            memory = memory - savesize;
        }
        else{
            System.out.println("Memory insufficicent");
        }
    }
}
class File extends Thread{
    Saver sa1;
    Filzer f1;
    File(Saver sa1,Filzer f1){
        this.sa1 = sa1;
        this.f1 = f1;
    }
    public void run(){
        f1.saving();
    }
}
class Files{
    public static void main(String args[]) throws InterruptedException{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the file size : ");
    int size = sc.nextInt();
    Saver sa1 = new Saver();
    Filzer f1 = new Filzer(sa1,size);
    File fi1 = new File(sa1,f1);
    File fi2 = new File(sa1,f1);
    fi1.start();
    fi2.start();
    fi1.join();
    fi2.join();
    }
}
