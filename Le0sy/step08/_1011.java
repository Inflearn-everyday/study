package step8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _1011 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스

        for (int i = 0; i < T; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());

            int dist = Y - X;
            int max = (int) Math.sqrt(dist);

            if (max == Math.sqrt(dist)) {
                bw.write((int) (max * 2 - 1) + "\n");
            } else if (dist <= max * max + max) {
                bw.write((int) (max * 2) + "\n");
            } else {
                bw.write((int) (max * 2 + 1) + "\n");
            }
        }
        bw.flush();
    }
}
