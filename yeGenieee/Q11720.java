import java.util.Scanner;

public class Q11720 {
    public static void main(String[] args) {
        int answer = 0;
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        String input = scanner.nextLine();

        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(Character.toString(input.charAt(i)));
            answer += number;
        }

        System.out.println(answer);
    }
}
