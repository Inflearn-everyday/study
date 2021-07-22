package step9;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.lang.Math;

public class Boj_9020 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		int i, j, k, n, p1=0, p2=0, minus, temp, dif;
		
		boolean[] prime = new boolean[10001];
		ArrayList<Integer> sosu = new ArrayList<>();
		
		for(i=2; i<=10000; i++)
			prime[i] = true;
		
		for(i=2; i*i<=10000; i++) {
			for(j=i*2; j<=10000; j+=i) {
				if(prime[j])
					prime[j] = false;
			}
		}
		
		for(i=2; i<=10000; i++) {
			if(prime[i])
				sosu.add(i);
		}
		
		for(i=0; i<t; i++) {
			n = Integer.parseInt(br.readLine());
			
			minus = sosu.get(sosu.size()-1) - sosu.get(0);
			
			for(j=0; j<sosu.size(); j++) {
				temp = n - sosu.get(j);
				if(temp>=2 && prime[temp]) {
					dif = Math.abs(temp - sosu.get(j));
					if(dif < minus) {
						minus = dif;
						p1 = sosu.get(j);
						p2 = temp;
					}
				}
			}
			
			bw.write(p1 + " " + p2 + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}
