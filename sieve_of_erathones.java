import java.util.*;

class erathones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of Boolean array");
        int num = sc.nextInt();
        boolean[] bool = new boolean[num];
        for (int i = 0; i < bool.length; i++) {
            bool[i] = true;
        }
        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (bool[j] == true) {
                for (int z = j * j; z < num; z += j) {
                    bool[z] = false;
                }
            }
        }
        System.out.println("the prime numbers upto " + num + "  are: ");
        for (int j = 2; j < num; j++) {
            if (bool[j] == true) {
                System.out.println(j);
            }
        }
    }
}
