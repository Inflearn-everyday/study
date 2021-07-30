package step11;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int[] card = new int[n];
		int i = 0;
		
		while(st.hasMoreTokens())
			card[i++] = Integer.parseInt(st.nextToken());
		
		int result = 0;
		int j, k, max = 0;
		
		for(i=0; i<n-2; i++) {
			for(j=i+1; j<n-1; j++) {
				for(k=j+1; k<n; k++) {
					result = card[i] + card[j] + card[k];
					if (result <= m && result > max)
						max = result;
				}
			}
		}
		
		System.out.println(max);
	}
}
