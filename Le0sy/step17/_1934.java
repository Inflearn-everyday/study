import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bojTest {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String[] str = br.readLine().split(" ");
			int i0 = Integer.parseInt(str[0]);
			int i1 = Integer.parseInt(str[1]);
			System.out.println(i0*i1/GCD(i0, i1));
		}
	}

	static int GCD(int a, int b) {
		if(b==0) return a;
		return GCD(b, a % b);
	}
}
