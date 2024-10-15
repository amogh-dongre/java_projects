import java.util.*;

class booths {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = 0;
        int n = Integer.toBinaryString(a).length();

        for (int i = 0; i < n; i++) {
            int curr_bit = (a & 1);
            if (curr_bit == 1) {
                product += b;
            }
            b <<= 1;
            a >>= 1;
        }
        System.out.println("The product is: " + product);
    }
}
