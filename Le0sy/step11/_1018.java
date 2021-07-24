package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean[][] arr = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int tmp = br.read();
                if (tmp == 10) {
                    tmp = br.read();
                }
                if (tmp == 87) { // W인 경우
                    arr[i][j] = true;
                }
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                int cnt = 0;
                boolean block = arr[i][j];
                for (int k = i; k < i + 8; k++) {
                    for (int l = j; l < j + 8; l++) {
                        if (arr[k][l] != block) {
                            cnt++;
                        }
                        block = (!block);
                    }
                    block = (!block);
                }
                cnt = Math.min(cnt, 64 - cnt);
                min = Math.min(min, cnt);
            }
        }
        System.out.println(min);
    }
}
