import java.util.Scanner;

public class Q10871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x = scanner.nextInt();

        while (n-- > 0) {
            int num = scanner.nextInt();
            if (num < x) {
                System.out.print(num + " ");
            }
        }
    }
}