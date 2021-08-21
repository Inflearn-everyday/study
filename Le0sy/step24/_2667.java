package step24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2667 {
    static int dx[] = {0, 0, 1, -1};
    static int dy[] = {1, -1, 0, 0};
    static int[] apts = new int[314];
    static int apt_idx = 0;
    static StringBuilder sb = new StringBuilder();
    static GND[][] gnd;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        gnd = new GND[N][N];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                gnd[i][j] = new GND();
                gnd[i][j].apt = (s.charAt(j) == '1');
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (gnd[i][j].apt && !gnd[i][j].visited) {
                    apt_idx++;
                    dfs(i, j);
                }
            }
        }

        Arrays.sort(apts);

        sb.append(apt_idx).append('\n');

        for (int apt : apts) {
            if (apt != 0) {
                sb.append(apt).append('\n');
            }
        }
        System.out.println(sb);
    }

    static void dfs(int x, int y) {
        gnd[x][y].visited = true;
        apts[apt_idx]++;

        for (int i = 0; i < 4; i++) {
            int cx = x + dx[i];
            int cy = y + dy[i];

            if (cx >= 0 && cy >= 0 && cx < N && cy < N) {
                if (gnd[cx][cy].apt && !gnd[cx][cy].visited) {
                    dfs(cx, cy);
                }
            }
        }
    }
}

class GND {
    boolean apt;
    boolean visited;

    GND() {
        apt = false;
        visited = false;
    }
}