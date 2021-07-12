package step10;

import java.util.Scanner;

public class _10872 {
    public static void main(String[] args) {
        System.out.println(rec(new Scanner(System.in).nextInt()));
    }

    public static int rec(int N) {
        if (N <= 1)
            return 1;
        else
            return N * rec(N - 1);
    }
}