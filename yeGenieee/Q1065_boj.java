import java.util.Scanner;

public class Q1065_boj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        System.out.println(getCount(N));
    }

    public static int getCount(int number) {
        int cnt = 0;

        if (number < 100) {
            return number;
        } else {
            cnt = 99;

            if (number == 1000) {
                number = 999;
            }

            for (int i = 100; i <= number; i++) {
                int hundred = i / 100;
                int ten = (i / 10) % 10;
                int one = i % 10;

                if ((hundred - ten)  == (ten - one)) {
                    cnt++;
                }
            }
        }

        return cnt;
    }

}
