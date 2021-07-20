package step9;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Boj_4948 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int i, j, cnt;
		
		while(n != 0) {
			ArrayList<Boolean> prime = new ArrayList<>(2*n + 1);
			cnt = 0;
			
			prime.add(0, false);
			prime.add(1, false);
			
			for(i=2; i<=2*n; i++)
				prime.add(i, true);
			
			for(i=2; i*i<=2*n; i++) {
				for(j=i*2; j<=2*n; j+=i) {
					if(prime.get(j))
						prime.set(j, false);
				}
			}
			
			for(i=n+1; i<=n*2; i++) {
				if(prime.get(i))
					cnt++;
			}
			
			bw.write(cnt + "\n");
			n = Integer.parseInt(br.readLine());
		}
		
		bw.flush();
		bw.close();
	}
	
}
