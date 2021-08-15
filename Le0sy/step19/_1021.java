package step19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class _1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 1; i < N + 1; i++) {
            dq.add(i);
        }

        st = new StringTokenizer(br.readLine());
        int result = 0;
        for (int i = 0; i < M; i++) {

            int f_idx = Integer.parseInt(st.nextToken());
            int idx = 0;
            for (int j = 0; j < dq.size(); j++) {
                Integer poll = dq.poll();
                if (poll == f_idx)
                    idx = j;
                dq.add(poll);
            }
            if ((dq.size() / 2) >= idx) {
                while (dq.peekFirst() != f_idx) {
                    dq.addLast(dq.pollFirst());
                    result++;
                }
                dq.pollFirst();
            } else {
                while (dq.peekLast() != f_idx) {
                    dq.addFirst(dq.pollLast());
                    result++;
                }
                result++;
                dq.pollLast();
            }
        }
        System.out.println(result);
    }
}