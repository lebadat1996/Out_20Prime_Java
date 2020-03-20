package OUT20Prime;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = scanner.nextInt();
        int count = 0;
        int i = 2;
        while (count < number) {
            if (isPrimeNumber(i)) {
                System.out.println(i + "");
                count++;
            }
            i++;
        }

    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}