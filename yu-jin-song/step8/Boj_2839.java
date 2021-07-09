package step8;

import java.util.Scanner;

public class Boj_2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int five, temp;
		int cnt = -1, tempCnt;
		boolean multi = false;
		
		//3�� ����� �ش����� �ʴ� 5�� ����� �Ǵ�(5kg���θ� ä���)
		if(n%5 == 0 && n%3 != 0) {
			cnt = n/5;
			multi = true;
		}
		
		//5�� ����� �ش����� �ʴ� 3�� ����� �Ǵ�(3kg���θ� ä���)
		if(n%3 == 0 && n%5 != 0) {
			cnt = n/3;
			multi = true;
		}
		
		//3�� ����̸鼭 5�� ����� ���
		if(n%3 == 0 && n%5 == 0) {
			cnt = n/5;  //5kg���θ� ä��� ���� ���� ������ ä�� �� ����
			multi = true;
		}
		
		//�����ؾ� �ϴ� ���(���� 1�����̶� ����ؼ� ä���� �ϴ� ���)
		if(n/3 != 0 && n/5 != 0) {
			
			for(int i=1; i<n/3; i++) {
				five = (n - (3*i)) / 5;
				temp = (n - (3*i)) % 5;

				if(temp == 0) { 
					tempCnt = i + five;

					if(multi) { // �� �׸����ε� ä�� �� �ִ� ��찡 ������ ��
						if(tempCnt < cnt) // ���� ���ؼ� �����ϴ� ����� ���� �� ���� ��
							cnt = tempCnt;
					}
					else { // ���ո����� �ؾ� �� ��
						if(cnt == -1 || tempCnt < cnt)
							cnt = tempCnt;
					}
				}
			}
			
		}
		
		System.out.println(cnt);
	}
	
}
