package step10;

import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Boj_2447 {
	static char[][] arr;
	
	public static void main(String[] args) throws IOException  {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = sc.nextInt();
		
		arr = new char[n][n];
		
		print(0, 0, n, false);
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				bw.write(arr[i][j]);
			}
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
	}
	
	static void print(int x, int y, int n, boolean blank) {
		
		if(blank) {  //���� ����ؾ� �� �κ��̸�(���)
			for(int i=x; i<x+n; i++) {  // ���޵Ǿ�� x��ǥ���� ���� ũ�⸸ŭ
				for(int j=y; j<y+n; j++) {  //���޵Ǿ�� y��ǥ���� ���� ũ�⸸ŭ
					arr[i][j] = ' ';  // ���� ����
				}
			}
			return;  //����
		}
		
		if(n == 1) {  //�� �̻� ��� ������ �ɰ� �� ���� + ������ �ƴ� �� * ����
			arr[x][y] = '*';
			return;
		}

		int size = n/3;  //���� ũ�� ����
		int count = 0;  //���° �������
		for(int i=x; i<x+n; i+=size) {  //x��ǥ���� n����, ���� ũ�� ��ŭ ����
			for(int j=y; j<y+n; j+=size) {  //y��ǥ���� n����, ���� ũ�� ��ŭ ����
				count++;  //��� ���� ī��Ʈ
				if(count == 5)  // ��� ����̸�
					print(i, j, size, true);
				else  // ��� ��� �ƴϸ�
					print(i, j, size, false);
			}
		}
	}
}
