import java.util.Scanner;

public class Q2908 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int reversedA = 0;
        int reversedB = 0;
        int multiple = 100;

        while (A > 0) {
            reversedA += ((A % 10) * multiple);
            reversedB += ((B % 10) * multiple);

            A = A / 10;
            B = B / 10;
            multiple = multiple / 10;
        }

        System.out.println(Math.max(reversedA, reversedB));
    }
}
