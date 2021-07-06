package step8;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Boj_10250 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			
			int y; // 類 熱
			int x = n/h;  //廓��
			int full = 0;
			
			if(n%h == 0) { // 窕渠晦 類
				y = h; // 類擎 殮溘嫡擎 類熱煎
				x = n/h;
			}
			else { // 窕渠晦 類 薯諼
				y = n%h; // 槳椒熱%類熱
				x = n/h + 1;
			}
			
			bw.write(Integer.toString(y));
			
			if(x<10)
				bw.write("0");
			
			bw.write(x + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}
