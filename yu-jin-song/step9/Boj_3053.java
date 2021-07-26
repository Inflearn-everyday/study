package step9;

import java.util.Scanner;

public class Boj_3053 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		
		System.out.println(String.format("%.6f", Math.PI*Math.pow(r, 2)));
		System.out.println(String.format("%.6f", 2*Math.pow(r, 2)));
	}
}
