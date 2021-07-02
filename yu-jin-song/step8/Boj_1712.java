package step8;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1712 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        StringTokenizer st = new StringTokenizer(br.readLine());
        
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		long c = Long.parseLong(st.nextToken());
		
		/*
		 * 规过1
		 */
		long profit = 0L;
		int n = 0;
		
		while(++n < Integer.MAX_VALUE) {
			if((n*c) > (a+(b*n))) {
				profit = n;
				break;
			}
		}
		
		if(profit == 0L)
			profit = -1;
		
		System.out.println(profit);
		
		/*
		 * 规过2 - 角青 加档啊 歹 狐抚
		 */
		int cnt = 0;
		
		while(cnt*c <= a+(b*cnt) && cnt < Integer.MAX_VALUE)
			cnt++;
		
		if(cnt == Integer.MAX_VALUE)
			cnt = -1;
		
		System.out.println(cnt);
	}
	
}