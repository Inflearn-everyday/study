package step9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _9020 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] primes = new boolean[10001];
        primes[0] = primes[1] = true;
        for (int i = 2; i <= (int) Math.sqrt(primes.length); i++) {
            if (primes[i]) {
                continue;
            }
            for (int j = i * i; j < primes.length; j += i) {
                primes[j] = true;
            }
        }

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int A = Integer.parseInt(br.readLine()) / 2;
            int B = A;
            while (primes[A] || primes[B]) {
                A--;
                B++;
            }
            bw.write(A + " " + B + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}