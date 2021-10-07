import java.util.Scanner;

public class Q10250 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int height = scanner.nextInt();
            int width = scanner.nextInt();
            int n = scanner.nextInt();

            int [][] hotel = new int[height][width];

            int cnt = 0;
            for (int j=0; j < width; j++) {
                for (int i = 0; i < height; i++) {
                    hotel[i][j] = ++cnt;

                    if (n == cnt) {
                        String number = (j + 1) > 9 ? "" + (j+1) : "0" + (j+1);
                        System.out.println((i+1) + "" + (number));
                        break;
                    }
                }
            }
        }
    }
}
