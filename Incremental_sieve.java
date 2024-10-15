import java.util.*;

class IncSieve {

    static List<Integer> IncrementalSieve(int n) {
        List<Integer> oddnumber = new ArrayList<>();
        for (int i = 3; i <= n; i += 2) {
            oddnumber.add(i);
        }
        int n1 = oddnumber.size();
        List<Integer> primes = new ArrayList<>();
        primes.add(2);
        for (int j = 0; j < oddnumber.size(); j++) {
            int current = oddnumber.get(j);
            if (current != -1) {
                primes.add(current);
                for (int k = j; k < oddnumber.size(); k++) {
                    if (oddnumber.get(j) % current == 0) {
                        oddnumber.set(j, -1);
                    }
                }
            }
        }
        return primes;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> primes = IncrementalSieve(n);
        System.out.println("Prime numbers until " + n + " are: " + primes);
    }
}
