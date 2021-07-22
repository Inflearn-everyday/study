package step9;

import java.util.Scanner;

public class Boj_1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int[] m = new int[4];
		
		m[0] = x;
		m[1] = y;
		m[2] = w-x;
		m[3] = h-y;
		
		int min = m[0];
		
		for(int i=0; i<3; i++) {
			for(int j=i+1; j<4; j++) {
				if(m[i] > m[j] && m[j] < min)
					min = m[j];
				if(m[i] < m[j] && m[i] < min)
					min = m[i];
			}
		}
		
		System.out.println(min);
	}
}
