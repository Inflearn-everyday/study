package daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _20001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String cmd;
        int result = 0;
        while (!(cmd = br.readLine()).equals("고무오리 디버깅 끝")) {
            if (cmd.equals("고무오리")) {
                if (result != 0) {
                    result--;
                } else {
                    result += 2;
                }
            } else {
                result++;
                break;
            }
        }
        System.out.println(result == 0 ? "고무오리야 사랑해" : "힝구");
    }
}
