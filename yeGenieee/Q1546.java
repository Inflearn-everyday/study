import java.util.Scanner;

public class Q1546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] scores = new int[N];

        int max = scores[0];

        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();

            if (scores[i] > max) {
                max = scores[i];
            }
        }

        double sum = 0.0;
        for (int i = 0; i < scores.length; i++) {
            double newScore = (double) scores[i] / (double) max * (double) 100;
            sum += newScore;
        }

        System.out.println(sum / N);
    }
}
