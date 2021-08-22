package step24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1012 {
    static int dx[] = {0, 0, 1, -1};
    static int dy[] = {1, -1, 0, 0};
    static StringBuilder sb = new StringBuilder();
    static ground[][] bc;
    static int X;
    static int Y;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int result = 0;
            st = new StringTokenizer(br.readLine());
            X = Integer.parseInt(st.nextToken());
            Y = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            bc = new ground[X][Y];

            for (int j = 0; j < X; j++) {
                for (int k = 0; k < Y; k++) {
                    bc[j][k] = new ground();
                }
            }

            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                bc[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())].check = true;
            }


            for (int j = 0; j < X; j++) {
                for (int k = 0; k < Y; k++) {
                    if (bc[j][k].check && !bc[j][k].visited) {
                        result++;
                        dfs(j, k);
                    }
                }
            }

            sb.append(result).append('\n');

        }
        System.out.println(sb);
    }

    static void dfs(int x, int y) {
        bc[x][y].visited = true;

        for (int i = 0; i < 4; i++) {
            int cx = x + dx[i];
            int cy = y + dy[i];

            if (cx >= 0 && cy >= 0 && cx < X && cy < Y) {
                if (bc[cx][cy].check && !bc[cx][cy].visited) {
                    dfs(cx, cy);
                }
            }
        }
    }
}

class ground {
    boolean check;
    boolean visited;

    ground() {
        check = false;
        visited = false;
    }
}