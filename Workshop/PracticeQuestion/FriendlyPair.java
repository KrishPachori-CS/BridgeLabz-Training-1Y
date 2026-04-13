import java.util.*;

public class FriendlyPair {

    static int sumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int a = 6;
        int b = 28;

        int sum1 = sumOfDivisors(a);
        int sum2 = sumOfDivisors(b);

        if ((double) sum1 / a == (double) sum2 / b) {
            System.out.println("Friendly Pair");
        } else {
            System.out.println("Not Friendly Pair");
        }
    }
}