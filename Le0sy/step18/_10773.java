package step18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10773 {
    static int[] stack;
    static int t = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        int result = 0;
        stack = new int[K];
        for (int i = 0; i < K; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input == 0) {
                pop();
            } else {
                push(input);
            }
        }

        while (t > 0) {
            result += pop();
        }
        System.out.println(result);

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
