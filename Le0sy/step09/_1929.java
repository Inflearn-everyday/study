package step9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[] isPrime = new boolean[N + 1];
        isPrime[0] = isPrime[1] = true;
        for (int i = 2; i <= (int) Math.sqrt(isPrime.length); i++) {
            if (isPrime[i]) {
                continue;
            }
            for (int j = i * i; j < isPrime.length; j+=i) {
                isPrime[j] = true;
            }
        }
        for (int i = M; i <= N; i++) {
            if (!isPrime[i]) {
                bw.write(i+"\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
