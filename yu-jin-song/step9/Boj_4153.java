package step9;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Boj_4153 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		int[] n = new int[3];
		
		while(true) {
			st = new StringTokenizer(br.readLine());
		
			n[0] = Integer.parseInt(st.nextToken());
			n[1] = Integer.parseInt(st.nextToken());
			n[2] = Integer.parseInt(st.nextToken());
			
			if(n[0] == 0)
				break;
			
			Arrays.sort(n);
		
			if(Math.pow(n[2], 2) == (Math.pow(n[0], 2) + Math.pow(n[1], 2)))
				bw.write("right\n");
			else
				bw.write("wrong\n");
		}
		
		bw.flush();
		bw.close();
	}
}
