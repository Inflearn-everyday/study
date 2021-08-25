import java.util.Scanner;

public class Q8958 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < num; i++) {
            String result = scanner.nextLine();
            int sum = 0;
            int score = 0;

            for (int j = 0; j < result.length(); j++) {
                char current = result.charAt(j);
                if (current == 'O') {
                    if (j >=1 && result.charAt(j-1) == 'O') {
                        score++;
                    } else {
                        score = 1;
                    }
                    sum += score;
                }
            }

            System.out.println(sum);

        }
    }
}
