package step9;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1978 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int cnt = 0;
		
		while(st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			if(num != 1 && prime(num))
				cnt++;
		}
		
		System.out.println(cnt);
	}
	
	static boolean prime (int num) {
		for(int i=2; i*i<=num; i++) {
			if(num%i == 0) // 나누어지는 수가 존재할 경우
				return false;
		}
		
		return true;  //루프 끝나면 나누어지는 수가 존재하지 않으므로
	}
	
}
