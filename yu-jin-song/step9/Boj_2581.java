package step9;

import java.util.Scanner;

public class Boj_2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = Integer.parseInt(sc.nextLine());
		int n = Integer.parseInt(sc.nextLine());
		
		int sum = 0, min= -1;
		
		for(int i=m; i<=n; i++) {
			if(i != 1 && prime(i)) { // 소수일 때
				sum += i;
				
				if(min == -1 || min > i)
					min = i;
			}
		}

		if(min == -1)
			System.out.println(min);
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
	
	static boolean prime (int num) {
		for(int i=2; i*i<=num; i++) {
			if(num % i == 0) // 소수가 아님
				return false;
		}
		
		return true; // 소수임
	}
}
