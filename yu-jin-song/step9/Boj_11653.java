package step9;

import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Boj_11653 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = sc.nextInt();
		int i = 2;
		int num = n;
		
		while(i <= n) { 
			if(num%i == 0) {
				bw.write(i + "\n");
				num /= i;
			}
			else
				i++;
		}

		bw.flush();
		bw.close();
	}
}
