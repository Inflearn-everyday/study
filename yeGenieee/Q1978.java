import java.util.Scanner;

public class Q1978 {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        } else if (num == 2) {
            return true;
        }

        for (int i=2; i*i<=num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;

        while (n-- >0) {
            int num = scanner.nextInt();
            if (isPrime(num)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
