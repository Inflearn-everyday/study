import java.util.Scanner;

public class Q4344 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int C = scanner.nextInt();

        for (int i = 0; i < C; i++) {
            int N = scanner.nextInt();

            int[] arr = new int[N];
            int sum = 0;
            for (int j = 0; j < N; j++) {
                arr[j] = scanner.nextInt();
                sum += arr[j];
            }

            double average = (double) sum / (double) N;

            int count = 0;
            for (int j = 0; j < N; j++) {
                if (average < (double) arr[j]) {
                    count++;
                }
            }

            double rate = (double) count / (double) N * 100.0;

            System.out.printf("%.3f", rate);
            System.out.println("%");
        }
    }
}
