import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Boj1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int[] arr = new int[26];
		String input = br.readLine();
		
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (Character.isLowerCase(c)) {
				arr[c - 'a']++;
			}
			else {
				arr[c - 'A']++;
			}
		}
		
		int max = -1;
		char output = '?';
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				output = (char) (i + 'A');
			}
			else if(arr[i] == max) {
				output = '?';
			}
		}
		
		System.out.println(output);
    }
}
