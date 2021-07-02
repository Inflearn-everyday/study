import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj5622 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine(); // UNUCIC
		int output = 0;
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			int num = (c - 'A') / 3;
			if(c == 'S' || c == 'V' || c == 'Y' || c == 'Z') {
				num--;
			}
			output += num + 3;
		}
		System.out.print(output);
	}
}
