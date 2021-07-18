package step10;

import java.util.Scanner;

public class Boj_10872 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(factorial(sc.nextInt()));
	}
	
	static int factorial(int n) {
		if(n > 0)
			return n * factorial(n-1);
		else
			return 1;
	}
}
