package step9;

import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Boj_1929 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		ArrayList<Boolean> prime = new ArrayList<>(n+1);
		
		if(prime.size() != 2) {
			int i;
			
			prime.add(0, false);
			prime.add(1, false);
		
			for(i=2; i<=n; i++)
				prime.add(i, true);
			
			for(i=2; i*i<=n; i++) {
				for(int j=i*2; j<=n; j+=i) {
					if(prime.get(j))
						prime.set(j, false);
				}
			}
			
			for(i=m; i<=n; i++) {
				if(prime.get(i))
					bw.write(i + "\n");
			}
			
			bw.flush();
			bw.close();
		}

	}
	
}
