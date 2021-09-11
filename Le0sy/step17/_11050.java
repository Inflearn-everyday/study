package step17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        System.out.println(nCr(Integer.parseInt(s[0]), Integer.parseInt(s[1])));
    }

    static int nCr(int n, int r) {
        return factorial(n) / factorial(r) / factorial(n-r);
    }

    static int factorial(int n) {
        if(n <= 1) return 1;
        return n * factorial(n-1);
    }
}
