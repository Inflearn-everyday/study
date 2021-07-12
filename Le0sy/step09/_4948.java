package step9;

import java.util.Scanner;

public class _4948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] chkPrime = new boolean[246913];
        chkPrime[0] = chkPrime[1] = true;

        for (int i = 2; i <= Math.sqrt(chkPrime.length); i++) {
            if (chkPrime[i]) continue;
            for (int j = i * i; j < chkPrime.length; j += i) {
                chkPrime[j] = true;
            }
        }
        int input;
        while ((input = sc.nextInt()) != 0) {
            int cnt = 0;
            for (int i = input + 1; i <= input * 2; i++) {
                if (!chkPrime[i]) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}