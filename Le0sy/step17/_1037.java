package step17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int tmp = Integer.parseInt(st.nextToken());
            if (tmp > max) max = tmp;
            if (min > tmp) min = tmp;
        }

        System.out.println(max * min);
    }
}
