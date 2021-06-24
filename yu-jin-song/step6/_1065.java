import java.util.Scanner;

public class _1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(hansu(n));
		
	}
	
	public static int hansu(int n) {
		int cnt = 0;
		
		if(n<100) {
			for(int i=1; i<=n; i++)
				cnt++;
		}
		else {
			int cha1, cha2;
			cnt = 99;
			
			for(int i=100; i<=n; i++) {
				String num = String.valueOf(i);
				
				cha1 = Character.getNumericValue(num.charAt(0)) - Character.getNumericValue(num.charAt(1));
				cha2 = Character.getNumericValue(num.charAt(1)) - Character.getNumericValue(num.charAt(2));
				
				if(cha1 == cha2)
					cnt++;
			}
		}
		
		return cnt;
	}
}
