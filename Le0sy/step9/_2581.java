package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int minPrime = -1;
        int sumPrime = 0;
        for (int i = M; i <= N; i++) {
            if (minPrime < 0) {
                minPrime = isPrime(i);
            }
            if (isPrime(i) > 0) {
                sumPrime += isPrime(i);
            }
        }
        if(sumPrime != 0) {
            System.out.print(sumPrime + "\n" + minPrime);
        } else {
            System.out.println(-1);
        }
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
