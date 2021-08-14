package step19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class _10866 {
    public static void main(String[] args) throws IOException {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            switch (cmd) {
                case "push_front":
                    dq.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    dq.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    System.out.println(dq.peekFirst() == null ? -1 : dq.pollFirst());
                    break;
                case "pop_back":
                    System.out.println(dq.peekLast() == null ? -1 : dq.pollLast());
                    break;
                case "size":
                    System.out.println(dq.size());
                    break;
                case "empty":
                    System.out.println(dq.isEmpty() ? 1 : 0);
                    break;
                case "front":
                    System.out.println(dq.peekFirst() == null ? -1 : dq.peekFirst());
                    break;
                case "back":
                    System.out.println(dq.peekLast() == null ? -1 : dq.peekLast());
                    break;
            }
        }
    }
}