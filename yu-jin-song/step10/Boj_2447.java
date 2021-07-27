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
		
		if(blank) {  //공백 출력해야 할 부분이면(가운데)
			for(int i=x; i<x+n; i++) {  // 전달되어온 x좌표부터 패턴 크기만큼
				for(int j=y; j<y+n; j++) {  //전달되어온 y좌표부터 패턴 크기만큼
					arr[i][j] = ' ';  // 공백 저장
				}
			}
			return;  //종료
		}
		
		if(n == 1) {  //더 이상 블록 단위로 쪼갤 수 없음 + 공백이 아님 → * 저장
			arr[x][y] = '*';
			return;
		}

		int size = n/3;  //패턴 크기 지정
		int count = 0;  //몇번째 블록인지
		for(int i=x; i<x+n; i+=size) {  //x좌표부터 n까지, 패턴 크기 만큼 증가
			for(int j=y; j<y+n; j+=size) {  //y좌표부터 n까지, 패턴 크기 만큼 증가
				count++;  //블록 갯수 카운트
				if(count == 5)  // 가운데 블록이면
					print(i, j, size, true);
				else  // 가운데 블록 아니면
					print(i, j, size, false);
			}
		}
	}
}
