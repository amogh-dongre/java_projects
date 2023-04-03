import java.util.*;
class Slice {
    String s;
    Scanner ip;
    int start, end;
    void rec_str(String s, int start, int end) {
        if (start == (end-1)) {
            System.out.println("\n"+"Done!");
        }
        else {
        System.out.print(s.charAt(start+1));
        rec_str(s, start+1, end);
        }
    }
    void SetS() {
        System.out.print("Enter the String: ");
        ip = new Scanner(System.in);
        s = ip.next();
    }
    void SetStart() {
        System.out.print("Enter the start index: ");
        ip = new Scanner(System.in);
        start = ip.nextInt();
    }
    void SetEnd() {
        System.out.print("Enter the end index: ");
        ip = new Scanner(System.in);
        end = ip.nextInt();
    }
}

class Assignemnt3 {
    public static void main(String ars[]) {
        Slice S1 = new Slice();
        S1.SetS();
        S1.SetStart();
        S1.SetEnd();
        S1.rec_str(S1.s,S1.start,S1.end);
    }
}