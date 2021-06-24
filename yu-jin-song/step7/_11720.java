import java.util.Scanner;

public class _11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String num = sc.nextLine();
		
		int sum = 0;
		
		for(int i=0; i<n; i++)
			sum += Character.getNumericValue(num.charAt(i));
		
		System.out.println(sum);
	}
}
