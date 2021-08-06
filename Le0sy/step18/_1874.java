package step18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1874 {
    static int[] stack = new int[100000];
    static int t;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int idx = 0;
        while (n-- > 0) {
            int tmp = Integer.parseInt(br.readLine());
            if (tmp > idx) {
                for (int i = idx + 1; i <= tmp; i++) {
                    push(i);
                }
                idx = tmp;
            } else if (top() != tmp) {
                System.out.println("NO");
                return;
            }
            pop();
        }
        System.out.println(sb);
    }

    static void push(int X) {
        stack[t++] = X;
        sb.append("+\n");
    }

    static int pop() {
        sb.append("-\n");
        if (t == 0) return -1;
        return stack[--t];
    }

    static int top() {
        if (t == 0) return -1;

        return stack[t - 1];
    }
}