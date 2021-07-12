package step8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long N = Long.parseLong(br.readLine());
        if (N == 1) {
            bw.write("1");
        } else {
            int n = 1;
            while (N > f(n)) {
                n++;
            }
            bw.write(n+"");
        }
        bw.flush();
        br.close();
        bw.close();
    }

    public static long f(long n) {
        // 3n^2 - 3n + 1
        return (3 * n * n) - (3 * n) + 1;
    }
}
