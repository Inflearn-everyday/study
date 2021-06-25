import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1065 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		for(int i = 1; i <= N; i++) {
			if(myFunc(i)) cnt++;
		}
		System.out.println(cnt);
		
	}
	
	public static boolean myFunc(int x) {
		int prev = x % 10;
		x /= 10;
		int now = x % 10;
		int diff = prev - now;
		prev = now;
		x /= 10;
		while(x != 0) {
			int prevDiff = diff;
			now = x % 10;
			diff = prev - now;
			if(prevDiff != diff) return false;
			prev = now;
			x /= 10;
		}
		return true;
	}

}
