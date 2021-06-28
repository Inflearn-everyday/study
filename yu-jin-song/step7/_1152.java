import java.util.Scanner;
import java.util.StringTokenizer;

public class _1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine().trim();
		StringTokenizer st = new StringTokenizer(str);
		int cnt = 0;
		
		while(st.hasMoreTokens()) {
			st.nextToken();
			cnt++;
		}
		
		System.out.println(cnt);
	}
}
