import java.util.*;
class Letter{
    String sender,reciever,body;
    Letter(String sender,String reciever){
        this.sender=sender;
        this.reciever=reciever;
    }
    void addLine(String Line){

        body+=Line+"\n";
    }
    String getText(){
        String greet="Dear "+reciever+"\n";
        String preamble= "Sincerely, \n"+sender;
        return greet+body+"\n"+preamble+"\n";
    }
    public static void main(String[] args) {
        Letter l = new Letter("Amogh", "karthikeya");
        l.addLine("hi");
        l.addLine("I am fine here");
        l.addLine("hope you are fine ");
        System.out.println(l.getText());
    }
}
