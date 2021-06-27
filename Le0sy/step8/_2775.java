package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            System.out.println(getP(k, n));
        }
    }

    static int getP(int k, int n) {
        if (n == 1) {
            return 1;
        } else if (k == 0) {
            return n;
        } else {
            return getP(k - 1, n) + getP(k, n - 1);
        }
    }
}