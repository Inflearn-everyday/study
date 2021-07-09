package step8;

import java.util.Scanner;

public class Boj_2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int five, temp;
		int cnt = -1, tempCnt;
		boolean multi = false;
		
		//3의 배수에 해당하지 않는 5의 배수만 판단(5kg으로만 채우기)
		if(n%5 == 0 && n%3 != 0) {
			cnt = n/5;
			multi = true;
		}
		
		//5의 배수에 해당하지 않는 3의 배수만 판단(3kg으로만 채우기)
		if(n%3 == 0 && n%5 != 0) {
			cnt = n/3;
			multi = true;
		}
		
		//3의 배수이면서 5의 배수인 경우
		if(n%3 == 0 && n%5 == 0) {
			cnt = n/5;  //5kg으로만 채우면 가장 적은 갯수로 채울 수 있음
			multi = true;
		}
		
		//조합해야 하는 경우(각자 1번씩이라도 사용해서 채워야 하는 경우)
		if(n/3 != 0 && n/5 != 0) {
			
			for(int i=1; i<n/3; i++) {
				five = (n - (3*i)) / 5;
				temp = (n - (3*i)) % 5;

				if(temp == 0) { 
					tempCnt = i + five;

					if(multi) { // 한 항목만으로도 채울 수 있는 경우가 존재할 때
						if(tempCnt < cnt) // 둘이 비교해서 조합하는 경우의 수가 더 적을 때
							cnt = tempCnt;
					}
					else { // 조합만으로 해야 할 때
						if(cnt == -1 || tempCnt < cnt)
							cnt = tempCnt;
					}
				}
			}
			
		}
		
		System.out.println(cnt);
	}
	
}
