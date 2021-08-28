package step17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while (!((str = br.readLine()).equals("0 0"))) {
            String[] s = str.split(" ");
            int i0 = Integer.parseInt(s[0]);
            int i1 = Integer.parseInt(s[1]);
            if (i1 % i0 == 0) {
                System.out.println("factor");
            } else if (i0 % i1 == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }
    }
}
