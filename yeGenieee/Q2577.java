import java.util.Scanner;

public class Q2577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int[] arr = new int[10];

        String multiple = String.valueOf(A * B * C);

        for (int i = 0; i < multiple.length(); i++) {
            int num = Integer.parseInt(String.valueOf(multiple.charAt(i)));
            arr[num]++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
