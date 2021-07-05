package step8;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
        
        int days = (v-a)/(a-b) + 1;
        int namugee = (v-a)%(a-b);
        
        if(namugee != 0)
        	days += 1;
		
		System.out.println(days);
	}
}