import java.util.*;
class StatesException extends RuntimeException{
    int type;
    StatesException(int type){
        this.type=type;
    }
    String evalException(){
        if (type==1)
            return "Invalid index number entered";
        else
            return "null";
    }
    @Override
    public String toString() {
        return evalException();
    }
}
class StatesInput{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] states = {"Assam","Uttar Pradesh","Maharashtra","Bihar","Goa","Jharkhand","Haryana","Gujarat"};
    String[] captial= {"Disput","Lucknow","Mumbai","Patna","Panaji","Ranchi","Chhattisgarh","Gandhinagar"};
    int index=sc.nextInt();
    try{
        if(index<0)
            throw new StatesException(1);
        else{
            System.out.print("State: "+states[index-1]+"\n");
            System.out.print("Capital: "+captial[index-1]);
        }
    }
    catch(StatesException se){
        System.out.println(se);
    }
    }
}
