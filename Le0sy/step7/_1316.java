package step7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result = 0;
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            result += isGroup(br.readLine());
        }
        bw.write("" + result);
        bw.flush();
        bw.close();
        br.close();
    }

    public static int isGroup(String s) {
        char tmp = s.charAt(0);
        boolean[] found = new boolean[26]; // 알파벳 탐지 확인 배열
        for (int i = 1; i < s.length(); i++) {
            if (tmp != s.charAt(i)) {
                if (!found[s.charAt(i) - 'a']) {
                    found[tmp - 'a'] = true;
                    tmp = s.charAt(i);
                } else {
                    return 0;
                }
            }
        }
        return 1;
    }
}
