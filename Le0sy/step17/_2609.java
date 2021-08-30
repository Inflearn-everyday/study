package step17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int i1 = Integer.parseInt(input[0]);
        int i2 = Integer.parseInt(input[1]);

        int gcd = GCD(i1, i2);
        System.out.println(gcd);
        System.out.println(i1 * i2 / gcd);
    }

    static int GCD(int a, int b) {
        if (b == 0) return a;
        return GCD(b, a % b);
    }
}