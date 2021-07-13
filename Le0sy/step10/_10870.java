package step10;

import java.util.Scanner;

public class _10870 {
    public static void main(String[] args) {
        System.out.println(fib(new Scanner(System.in).nextInt()));
    }

    public static int fib(int n) {
        if(n >= 2) {
            return fib(n - 2) + fib(n - 1);
        } else if (n == 1) {
            return 1;
        } else  {
            return 0;
        }
    }
}