package step9;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Boj_3009 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int[] x = new int[3];
		int[] y = new int[3];
		
		StringTokenizer st;
		
		for(int i=0; i<3; i++) {
			st = new StringTokenizer(br.readLine());
			
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(x);
		Arrays.sort(y);
		
		// way1. more faster
		/*int ansX, ansY;
		
		if(x[0] == x[1])
			ansX = x[2];
		else
			ansX = x[0];
		
		if(y[0] == y[1])
			ansY = y[2];
		else
			ansY = y[0];
		
		System.out.println(ansX + " " + ansY);*/
		
		// way2. clearer
		System.out.println(compare(x) + " " + compare(y));
	}
	
	static int compare(int[] num) {
		if(num[0] == num[1])
			return num[2];
		else
			return num[0];
	}
}
