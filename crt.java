import java.util.*;

class CRT {

    static int calc_CRT(int[] a, int[] m, int n, int p) {
        int x = 0;
        for (int i = 0; i < n; i++) {
            int M = p / m[i];
            int y = 0;
            for (int j = 0; j < m[i]; j++) {
                if (((M * j) % m[i]) == 1) {
                    y = j;
                    break;
                }
            }
            x += a[i] * M * y;
        }
        return x % p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 0, p = 1;
        int[] a, m = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        for (int j = 0; j < size; j++) {
            m[i] = sc.nextInt();
            p *= m[i];
        }
        System.out.println(
            "Chinese Remainder theorem of the given pair is: " +
            calc_CRT(a, m, size, p)
        );
    }
}
