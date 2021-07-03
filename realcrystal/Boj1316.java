import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj1316 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int result = 0;
		for (int i = 0; i < N; i++) {
			if (isGroupWord(br.readLine())) {
				result++;
			}
		}
		System.out.print(result);
	}

	private static boolean isGroupWord(String word) {
		boolean[] alphabet = new boolean[26];
		char prev = word.charAt(0);
		for (int i = 1; i < word.length(); i++) {
			char now = word.charAt(i);
			if (now != prev) {
				if (alphabet[now - 'a']) {
					return false;
				}
				alphabet[prev - 'a'] = true;
			}
			prev = now;
		}
		return true;
	}

}
