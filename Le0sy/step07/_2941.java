package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2941 {
    public static void main(String[] args) throws IOException {
        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        for (String s : croatia) {
            str = str.replace(s, "A");
        }
        System.out.println(str.length());
    }
}
