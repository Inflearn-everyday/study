package step8;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Boj_2775 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());

		int k, n, j;
		
		for(int i=0; i<t; i++) {
			int[] pre = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
			
			k = Integer.parseInt(br.readLine());
			n = Integer.parseInt(br.readLine());
			
			int[] post = new int[n+1];
			
			post[1] = 1;
			
			for(j=1; j<=k; j++) {
				for(int l=2; l<=n; l++)
					post[l] = pre[l] + post[l-1];

				for(int l=2; l<=n; l++)
					pre[l] = post[l];
			}
			
			bw.write(post[n] + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}
