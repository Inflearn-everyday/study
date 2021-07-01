package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int result = 0;
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (isPrime(n) != -1) {
                result += 1;
            }
        }
        System.out.println(result);
    }


    public static int isPrime(int k) {
        boolean isPrime = true;
        if (k == 1) {
            return -1;
        }
        for (int j = 2; j < k; j++) {
            if (k % j == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            return k;
        } else {
            return -1;
        }
    }
}
