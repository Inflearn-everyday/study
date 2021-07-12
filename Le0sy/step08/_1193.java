package step8;

import java.io.*;

public class _1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int i = 1;
        if (X == 1) {
            System.out.println("1/1");
            return;
        }
        while (X > f(i)) {
            i++;
        }
        // 분자 시작
        if (i % 2 == 1) {
            if (X == f(i)) {
                System.out.print("1");
            } else {
                for (int j = i; j > 0; j--) {
                    if (f(i) - j == X) {
                        System.out.print(j + 1);
                    }
                }
            }
        } else {
            if (X == f(i)) {
                System.out.print(i);
            } else {
                for (int j = 1; j <= i; j++) {
                    if (f(i-1) + j == X) {
                        System.out.print(j);
                    }
                }
            }
        }
        // 분자 끝


        // 분모 시작
        if (i % 2 == 0) {
            if (X == f(i)) {
                System.out.println("/1");
            } else {
                for (int j = i; j > 0; j--) {
                    if (f(i) - j == X) {
                        System.out.println("/" + (j + 1));
                    }
                }
            }
        } else {
            if (X == f(i)) {
                System.out.println("/" + i);
            } else {
                for (int j = 1; j <= i; j++) {
                    if (f(i-1) + j == X) {
                        System.out.println("/" + j);
                    }
                }
            }
        }
        // 분모 끝

    }

    public static int f(int n) {
        return ((n * (n + 1)) / 2);
    }
}
