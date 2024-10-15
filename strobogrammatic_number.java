import java.util.*;

class strobo {

    static boolean IsStrobo(String num) {
        int n = num.length();
        Map<Character, Character> strobo_dict = new HashMap<>();

        strobo_dict.put('0', '0');
        strobo_dict.put('1', '1');
        strobo_dict.put('6', '9');
        strobo_dict.put('8', '8');
        strobo_dict.put('9', '6');

        for (int i = 0, j = (n - 1); i <= j; i++, j--) {
            char left_digit = num.charAt(i);
            char right_digit = num.charAt(j);
            char map = strobo_dict.getOrDefault(left_digit, '-');
            if (map == '-') return false;
            if (map != right_digit) return false;
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
            "Enter the two numbers that need to be checked separated by a space: "
        );
        String str = sc.nextLine();
        String[] numbers = str.split(" ");

        if (numbers.length != 2) {
            System.out.println("Please enter exactly two numbers separated by a space.");
            sc.close();
            return;
        }


        boolean isStrobo1 = IsStrobo(numbers[0]);
        boolean isStrobo2 = IsStrobo(numbers[1]);

        if (isStrobo1 && isStrobo2) {
            System.out.println("Both numbers are strobogrammatic!");
        } else if (isStrobo1) {
            System.out.println("The first number is strobogrammatic, but the second is not.");
        } else if (isStrobo2) {
            System.out.println("The second number is strobogrammatic, but the first is not.");
        } else {
            System.out.println("Neither number is strobogrammatic.");
            System.out.
        }

        sc.close();
    }
}
