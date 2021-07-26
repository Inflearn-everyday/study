package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[8001];
        int sum = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int tmp = Integer.parseInt(br.readLine());
            arr[tmp + 4000]++;
            sum += tmp;
            if (tmp > max) max = tmp;
            if (min > tmp) min = tmp;
        }

        int cnt = 0, mode_max = 0, median = Integer.MAX_VALUE, mode = Integer.MAX_VALUE;
        boolean found = false;

        for (int i = 0; i < 8001; i++) {
            if (arr[i] > 0) {
                if (cnt < (N + 1) / 2) {
                    cnt += arr[i];
                    median = i - 4000;
                }

                if (mode_max < arr[i]) {
                    mode_max = arr[i];
                    mode = i - 4000;
                    found = true;
                } else if (mode_max == arr[i] && found) {
                    mode = i - 4000;
                    found = false;
                }
            }
        }
        System.out.println((int) Math.round((double) sum / N));
        System.out.println(median);
        System.out.println(mode);
        System.out.println(max - min);
    }
}
