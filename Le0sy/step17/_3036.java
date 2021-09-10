package step17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _3036 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N - 1; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            int gcd = GCD(n, tmp);
            sb.append(n/gcd).append("/").append(tmp / gcd).append('\n');
        }
        System.out.print(sb);
    }

    static int GCD(int x, int y) {
        if (y == 0) return x;
        return GCD(y, x % y);
    }
}