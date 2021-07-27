package step9;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Boj_1002 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		int x1, y1, r1, x2, y2, r2;
		double d;
		
		for(int i=0; i<t; i++) {
			st = new StringTokenizer(br.readLine());
			
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			r1 = Integer.parseInt(st.nextToken());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());
			r2 = Integer.parseInt(st.nextToken());
			
			d = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
			
			if(Math.abs(r2-r1) < d && d < Math.abs(r2+r1))
				bw.write("2\n");
			if((r2+r1) == d || Math.abs(r2-r1) == d)
				bw.write("1\n");
			if((r2+r1) < d || d < (r2-r1) || d == 0)
				bw.write("0\n");
			if((x1 == x2) && (x2 == y2) && (r1 == r2))
				bw.write("-1\n");
		}
		
		bw.flush();
		bw.close();
	}
}
