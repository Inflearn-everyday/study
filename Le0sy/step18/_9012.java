package step18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] stack = new int[51];
    static int t = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        char[] input;
        boolean b = false;
        for (int i = 0; i < T; i++) {
            input = (br.readLine()).toCharArray();
            b = false;
            for (int j = 0; j < input.length; j++) {
                if (input[j] == '(') {
                    push(1);
                } else if (input[j] == ')') {
                    if (pop() == -1) {
                        b = true;
                        break;
                    }
                }
            }
            if (b || t != 0) {
                sb.append("NO\n");
            } else {
                sb.append("YES\n");
            }
            t = 0;
        }
        System.out.println(sb);
    }

    static void push(int X) {
        stack[t++] = X;
    }

    static int pop() {
        if (t == 0) return -1;
        return stack[t--];
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