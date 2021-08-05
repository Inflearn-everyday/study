package step18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4949 {
    static int[] stack = new int[1001];
    static int t = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while (!(str = br.readLine()).equals(".")) {
            t = 0;
            char[] cArr = str.toCharArray();
            boolean NO = false;
            for (char c : cArr) {
                if (c == '(') {
                    push(1);
                } else if (c == '[') {
                    push(2);
                } else if (c == ']') {
                    if (pop() != 2) {
                        NO = true;
                        break;
                    }
                } else if (c == ')') {
                    if (pop() != 1) {
                        NO = true;
                        break;
                    }
                }
            }
            if (NO | t != 0) {
                System.out.println("no");
            } else {
                System.out.println("yes");
            }
        }
    }

    static void push(int X) {
        stack[t++] = X;
    }

    static int pop() {
        if(t==0) return -1;
        return stack[--t];
    }
}