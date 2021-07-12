package step9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _3053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int R = Integer.parseInt(br.readLine());

        bw.write(String.format("%.6f", (Math.PI * R * R)) + "\n");
        bw.write(String.format("%.6f", (2.0 * R * R)));

        bw.flush();
        bw.close();
        br.close();
    }
}
