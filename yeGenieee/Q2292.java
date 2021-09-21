import java.util.Scanner;

public class Q2292 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int round = 1;
        int start = 2;

        if (N == 1) {
            System.out.println(1);
        } else {
            while (start <= N) {
                start += (round * 6);
                round++;
            }
            System.out.println(round);
        }
    }
}
