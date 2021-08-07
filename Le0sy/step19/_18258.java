package step19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _18258 {
    static int[] q;
    static int b = 0;
    static int f = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        q = new int[N];
        int X;
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            if (cmd.equals("push")) {
                X = Integer.parseInt(st.nextToken());
                push(X);
            } else if (cmd.equals("pop")) {
                sb.append(pop()).append('\n');
            } else if (cmd.equals("size")) {
                sb.append(size()).append('\n');
            } else if (cmd.equals("empty")) {
                sb.append(empty()).append('\n');
            } else if (cmd.equals("front")) {
                sb.append(front()).append('\n');
            } else if (cmd.equals("back")) {
                sb.append(back()).append('\n');
            }
        }
        System.out.println(sb);
    }

    static void push(int X) {
        q[b++] = X;
    }

    static int pop() {
        if(b==f) return -1;
        return q[f++];
    }

    static int size() {
        return b-f;
    }

    static int empty() {
        if (b == f) return 1;
        return 0;
    }

    static int front() {
        if (b == f) return -1;
        return q[f];
    }

    static int back() {
        if (b == f) return -1;
        return q[b-1];
    }
}
