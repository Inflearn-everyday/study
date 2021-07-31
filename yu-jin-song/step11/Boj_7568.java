package step11;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Boj_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] rank = new int[n];
        int[] x = new int[n];
        int[] y = new int[n];
        StringTokenizer st;

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());

            x[i] = Integer.parseInt(st.nextToken());  //몸무게
            y[i] = Integer.parseInt(st.nextToken());  //키
            rank[i] = 1;
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) {
                if (x[i] < x[j] && y[i] < y[j])
                    rank[i]++;
            }
        }

        for(int i=0; i<n; i++)
            bw.write(rank[i] + " ");

        bw.newLine();
        bw.flush();
        bw.close();
    }
}