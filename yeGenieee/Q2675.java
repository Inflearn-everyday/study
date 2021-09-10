import java.util.Scanner;

public class Q2675 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int R = scanner.nextInt();
            String S = scanner.next();

            StringBuilder sb = new StringBuilder();

            for (char ch : S.toCharArray()) {
                for (int j = 0; j < R; j++) {
                    sb.append(ch);
                }
            }

            System.out.println(sb.toString());
        }
    }
}
