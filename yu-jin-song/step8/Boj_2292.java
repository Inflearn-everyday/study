package step8;

import java.util.Scanner;

public class Boj_2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int line;
		
		if(n != 1) {
			line = 2;
			int start = line;
		
			for(int i=2; i<=n; i++) {
				System.out.println("���� �� ��ȣ : " + i);
				if(i-start == 6*(line-1)) {
					System.out.println("���� ���� : " + line + ", �� ���� ��ȣ : " + start);
					line++;
					start = i;
				}
			}
		}
		else
			line = 1;
			
		System.out.println(line);
	}
}
