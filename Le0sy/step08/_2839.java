package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        int tmp = N;
        while (tmp % 5 != 0) {
            tmp -= 3;
            cnt++;
        }
        cnt += (tmp / 5);
        if (tmp < 0) {
            cnt = -1;
        }
        System.out.println(cnt);
    }
}
