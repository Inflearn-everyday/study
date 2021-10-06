import java.util.Scanner;

public class Q2775 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        int[][] apartment = new int[15][15];

        for (int j=0; j < 15; j++) {
            apartment[j][1] = 1;
            apartment[0][j] = j;
        }

        for (int i=1; i < 15; i++) {
            for (int j = 2; j < 15; j++) {
                apartment[i][j] = apartment[i-1][j] + apartment[i][j-1];
            }
        }

        while (T-- > 0) {
            int k = scanner.nextInt();
            int n = scanner.nextInt();

            System.out.println(apartment[k][n]);
        }
    }
}
