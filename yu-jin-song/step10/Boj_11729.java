package step10;

import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Boj_11729 {
	static int k = 0;
	static ArrayList<Integer> a = new ArrayList<>();
	static ArrayList<Integer> b = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = sc.nextInt();
		
		k = 0;
		
		move(n, 1, 3);
		
		bw.write(k + "\n");
		
		for(int i=0; i<a.size(); i++)
			bw.write(a.get(i) + " " + b.get(i) + "\n");
		
		bw.flush();
		bw.close();
	}
	
	static void move(int no, int x, int y) {
		if(no > 1) {
			move(no-1, x, 6-x-y);
		}
		
		a.add(k, x);
		b.add(k, y);
		
		k++;
		
		if(no > 1) {
			move(no-1, 6-x-y, y);
		}
	}
}
