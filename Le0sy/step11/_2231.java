package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2231 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < N; i++) {
            int k = i;
            int sum = 0;

            while (k != 0) {
                sum += k % 10;
                k /= 10;
            }

            if(N == sum + i) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
