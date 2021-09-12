package step17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2981 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int gcd = arr[1] - arr[0];

        for (int i = 2; i < N; i++) {
            gcd = GCD(gcd, arr[i] - arr[i - 1]);
        }

        for (int i = 2; i <= gcd; i++) {
            if ((gcd % i) == 0) {
                sb.append(i).append(' ');
            }
        }

        System.out.println(sb);
    }

    static int GCD(int x, int y) {
        if (y == 0) return x;
        return GCD(y, x % y);
    }
}
