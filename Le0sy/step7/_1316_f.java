package step7;

import java.io.*;
import java.util.Scanner;

public class _1316_f {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        //Scanner s = new Scanner(System.in);
        //int N = s.nextInt();
        int cnt = 0;
        for (int j = 0; j < N; j++) {
            int i = 1;
            String str = br.readLine();
            boolean group = true;
            String tmp = "";
            while (str.length() > 1) {
                if (str.replace("" + str.charAt(0), "").length() == 0) {
                    break;
                } else if (str.charAt(i) == str.charAt(i - 1)) {
                    i++;
                } else {
                    int n = str.length();
                    tmp = "" + str.charAt(i - 1);
                    str = str.replace(tmp, "");
                    if (str.length() != (n - i)) {
                        group = false;
                        break;
                    }
                    i = 1;
                }
            }
            if (group)
                cnt++;
        }
        bw.write("" + cnt);
        bw.flush();
        br.close();
        bw.close();
//        System.out.println(cnt);

    }
}
