package step12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[10001];
        int input;

        for (int i = 0; i < N; i++) {
            input = Integer.parseInt(br.readLine());
            arr[input]++;
        }

        for (int i = 0; i < 10001; i++) {
            if (arr[i] != 0) {
                for (int j = 0; j < arr[i]; j++) {
                    bw.write(i + "\n");
                }
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
