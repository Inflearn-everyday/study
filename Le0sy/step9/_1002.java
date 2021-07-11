package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        while (T > 0) {
            T--;
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            if (x2 == x1 && y2 == y1 &&  r2 == r1) {
                System.out.println("-1");
                continue;
            }

            int dist_sq = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
            int cond1 = (r2 - r1) * (r2 - r1);
            int cond2 = (r1 + r2) * (r1 + r2);

            if (dist_sq > cond2 || dist_sq < cond1) {
                System.out.println("0");
            } else if (dist_sq == cond2 || dist_sq == cond1) {
                System.out.println("1");
            } else {
                System.out.println("2");
            }
        }
    }
}