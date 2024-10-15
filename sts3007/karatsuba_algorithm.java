import java.math.BigInteger;
import java.util.Scanner;

public class karatsuba_algorithm 
{
    public static BigInteger karatsuba(BigInteger x, BigInteger y) {
        int n = Math.max(x.bitLength(), y.bitLength());

        if (n <= 2000) 
        {
            return x.multiply(y);
        }

        int half = (n + 32) / 64 * 32;
        BigInteger mask = BigInteger.ONE.shiftLeft(half).subtract(BigInteger.ONE);
        BigInteger xLow = x.and(mask);
        BigInteger yLow = y.and(mask);
        BigInteger xHigh = x.shiftRight(half);
        BigInteger yHigh = y.shiftRight(half);
        BigInteger z0 = karatsuba(xLow, yLow);
        BigInteger z1 = karatsuba(xLow.add(xHigh), yLow.add(yHigh));
        BigInteger z2 = karatsuba(xHigh, yHigh);

        BigInteger result = z2.shiftLeft(2 * half).add(z1.subtract(z2).subtract(z0).shiftLeft(half)).add(z0);
        return result;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        BigInteger x = scanner.nextBigInteger();
        System.out.print("Enter the second number: ");
        BigInteger y = scanner.nextBigInteger();
        BigInteger product = karatsuba(x, y);
        System.out.println("Product: " + product);
    }
}