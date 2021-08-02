package step18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10828 {
    public static int[] stack;
    public static int t = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int X;
        stack = new int[N];
        for (int i = 0; i < N; i++) {
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
            } else if (cmd.equals("top")) {
                sb.append(top()).append('\n');
            }
        }
        System.out.println(sb);
    }


    static void push(int X) {
        stack[t++] = X;
    }

    static int pop() {
        if (t == 0) return -1;
        return stack[--t];
    }

    static int size() {
        return t;
    }

    static int empty() {
        if (t == 0) return 1;
        return 0;
    }

    static int top() {
        if (t == 0) return -1;

        return stack[t - 1];
    }
}
