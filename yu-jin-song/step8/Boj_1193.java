package step8;

import java.util.Scanner;

public class Boj_1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int width=0, height=0, cnt=0;
		boolean sw = true;
		
		outer: for(int i=1; i<=x; i++) {
			if(sw) {
				height = 0;
				width = i+1;
				
				for(int j=i; j>=1; j--) {
					height++;
					width--;
					cnt++;
					sw = false;
					
					if(cnt==x)
						break outer;
				}
			}
			else {
				height = i+1;
				width = 0;
				for(int j=1; j<=i; j++) {
					height--;
					width++;
					cnt++;
					sw = true;
					
					if(cnt==x)
						break outer;
				}
			}
		}
		
		System.out.println(width + "/" + height);
	}
}
